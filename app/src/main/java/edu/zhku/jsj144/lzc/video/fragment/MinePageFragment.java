package edu.zhku.jsj144.lzc.video.fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import edu.zhku.jsj144.lzc.video.R;
import edu.zhku.jsj144.lzc.video.activity.MainActivity;
import edu.zhku.jsj144.lzc.video.activity.UploadChoiceActivity;

public class MinePageFragment extends Fragment {

    private Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment_page_mine, container, false);

        Button uploadButton = (Button) rootView.findViewById(R.id.upload);
        uploadButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity, UploadChoiceActivity.class);
                startActivity(intent);
            }
        });
        return rootView;
    }
}
