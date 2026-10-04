package com.orion.notein;

import OooOOOo.OooOOO0;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import androidx.core.os.BundleKt;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.fragment.app.FragmentManager;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.login.entry.LoginContainerFragment;
import kotlin.Metadata;
import o0O0oooO.AbstractActivityC26278OooOoo;
import oO00ooO.C32443OooOOO;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/LoginActivity;", "Landroidx/appcompat/app/OooO0oo;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class LoginActivity extends AbstractActivityC26278OooOoo {
    @Override // o0O0oooO.AbstractActivityC26278OooOoo, androidx.fragment.app.ActivityC21897OooOo0, OooO0Oo.OooOO0O, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        boolean z = false;
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        if (Build.VERSION.SDK_INT >= 28) {
            Window window = getWindow();
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            window.setAttributes(attributes);
        }
        setContentView(R.layout.activity_login);
        if (bundle == null) {
            Intent intent = getIntent();
            if (intent != null && (extras = intent.getExtras()) != null) {
                z = extras.getBoolean("show_forbidden_tip", false);
            }
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.OooO00o oooO00oOooO0OO = OooOOO0.OooO0OO(supportFragmentManager, supportFragmentManager);
            LoginContainerFragment loginContainerFragment = new LoginContainerFragment();
            loginContainerFragment.setArguments(BundleKt.bundleOf(new C32443OooOOO("arg_show_forbidden", Boolean.valueOf(z))));
            oooO00oOooO0OO.OooO0o0(loginContainerFragment, R.id.login_container);
            oooO00oOooO0OO.OooO0oo();
        }
        WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(getWindow(), getWindow().getDecorView());
        kotlin.jvm.internal.OooOOO0.OooO0o(insetsController, "getInsetsController(...)");
        insetsController.hide(WindowInsetsCompat.Type.systemBars());
    }
}
