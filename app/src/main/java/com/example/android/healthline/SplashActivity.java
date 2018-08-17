    package com.example.android.healthline;

    import android.support.v7.app.AppCompatActivity;
    import android.os.Bundle;


    import android.app.Activity;
    import android.content.Intent;
    import android.os.Bundle;
    import android.os.Handler;
    import android.widget.ProgressBar;

    public class SplashActivity extends Activity {
        private ProgressBar progressBar;

        @Override
        public void onCreate(Bundle savedBundleInstance) {
            super.onCreate(savedBundleInstance);
            setContentView(R.layout.activity_splash);

            progressBar = findViewById(R.id.progressBar);

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    progressBar.setProgress(25);
                }
            }, 500);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    progressBar.setProgress(50);
                }
            }, 500);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    progressBar.setProgress(75);
                }
            }, 500);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    progressBar.setProgress(100);
                    moveToLoginActivity();
                }
            }, 500);

        }


        protected void moveToLoginActivity() {
            Intent intent = new Intent(this, LoginActivity.class);
            //take splash off the stack
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            finish();
        }

    }
