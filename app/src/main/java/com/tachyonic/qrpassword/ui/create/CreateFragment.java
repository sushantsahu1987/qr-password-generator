package com.tachyonic.qrpassword.ui.create;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.tachyonic.qrpassword.R;
import com.tachyonic.qrpassword.ui.BaseFragment;
import com.tachyonic.qrpassword.ui.snapshot.SnapshotActivity;

/**
 * Created by ssahu on 3/27/2015.
 */
public class CreateFragment extends BaseFragment implements CreateView,View.OnClickListener {

    private View createView;
    private CreatePresenter createPresenter;
    private EditText edTitle,edPassword, edUsername,edSecretAnswer;
    private Spinner spAlgorithm;
    private Button btnGenQRCode;
    private TextView tvError;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        createView = inflater.inflate(R.layout.fragment_create,container);
        createPresenter = new CreatePresenterImpl(this,getActivity());
        return createView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initUI();
        bindCallbacks();
    }

    private void bindCallbacks() {
        btnGenQRCode.setOnClickListener(this);
    }

    private void initUI() {
        edTitle = (EditText) createView.findViewById(R.id.edEnterTitle);
        edPassword = (EditText) createView.findViewById(R.id.edEnterPassword);
        edUsername = (EditText) createView.findViewById(R.id.edEnterUsername);
        edSecretAnswer = (EditText) createView.findViewById(R.id.edEnterSecretAnswer);
        btnGenQRCode = (Button) createView.findViewById(R.id.btnGenerateQRCode);
        tvError = (TextView) createView.findViewById(R.id.tvError);
        spAlgorithm = (Spinner) createView.findViewById(R.id.spAlgorithm);
    }

    @Override
    public void navigateToSnapshotScreen(byte[] imageArray) {

        Bundle bundle = new Bundle();
        bundle.putByteArray(SnapshotActivity.SNAPSHOT_IMAGE_ARRAY_KEY,imageArray);
        bundle.putString(SnapshotActivity.SNAPSHOT_QR_TITLE_KEY,edTitle.getText().toString());
        Intent intent = new Intent(getActivity(), SnapshotActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
        getActivity().finish();

    }

    @Override
    public void setEmptyPasswordError() {
        tvError.setText("Password is empty");
    }

    @Override
    public void setEmptyUsernameError() {
        tvError.setText("Username is empty");
    }

    @Override
    public void setEmptyTitleError() {
        tvError.setText("Title is empty");
    }

    @Override
    public void setMinimumKeyLengthError() {
        tvError.setText("Minimum key length is 4 characters");
    }

    @Override
    public void setUnknownError(String msg) {
        tvError.setText(msg);
    }

    @Override
    public void onClick(View v) {

        CreateQRModel model = new CreateQRModel();
        model.setTitle(edTitle.getText().toString());
        model.setUsername(edUsername.getText().toString());
        model.setPassword(edPassword.getText().toString());
        model.setSecretAnswer(edSecretAnswer.getText().toString());
        model.setAlgorithm(spAlgorithm.getPrompt().toString());
        createPresenter.validateInput(model);

    }

}
