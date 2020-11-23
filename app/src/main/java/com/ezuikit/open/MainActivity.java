package com.ezuikit.open;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.ezvizuikit.open.EZUIKit;
import com.ezvizuikit.open.EZUIPlayer;
import com.videogo.openapi.EZOpenSDK;
import org.json.JSONArray;
import org.json.JSONException;

import static com.ezuikit.open.PlayActivity.APPKEY;
import static com.ezuikit.open.PlayActivity.AccessToekn;
import static com.ezuikit.open.PlayActivity.Global_AreanDomain;
import static com.ezuikit.open.PlayActivity.PLAY_URL;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    //预览播放按钮
    private Button mButtonPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE |
                WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButtonPlay = (Button) findViewById(R.id.btn_play);
        mButtonPlay.setOnClickListener(this);
        mButtonPlay = (Button) findViewById(R.id.btn_play);
    }

    @Override
    public void onClick(View view) {
            String url = mUrl;
            EZUIPlayer.getUrlPlayType(mUrl);
            PlayActivity.startPlayActivity(this, mAppKey, mAccessToken, mUrl);
        }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.exit(0);
    }
}
