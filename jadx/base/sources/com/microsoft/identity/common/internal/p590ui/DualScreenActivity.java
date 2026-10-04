package com.microsoft.identity.common.internal.p590ui;

import OooOOOo.OooOOO0;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.OooO0OO;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.OooO00o;
import com.microsoft.device.display.DisplayMask;
import com.microsoft.identity.common.C18549R;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class DualScreenActivity extends ActivityC21897OooOo0 {
    private void adjustLayoutForDualScreenActivity() {
        int rotation = getRotation(this);
        boolean zIsAppSpanned = isAppSpanned(this);
        boolean z = rotation == 0 || rotation == 2;
        OooO0OO oooO0OO = new OooO0OO();
        int i = C18549R.id.dual_screen_content;
        int i2 = C18549R.id.dual_screen_layout;
        oooO0OO.OooO0oO(i, 1, i2, 1, 0);
        oooO0OO.OooO0oO(i, 2, i2, 2, 0);
        oooO0OO.OooO0oO(i, 3, i2, 3, 0);
        oooO0OO.OooO0oO(i, 4, i2, 4, 0);
        int i3 = C18549R.id.dual_screen_empty_view;
        oooO0OO.OooO0oO(i3, 1, i2, 1, 0);
        oooO0OO.OooO0oO(i3, 2, i2, 2, 0);
        oooO0OO.OooO0oO(i3, 3, i2, 3, 0);
        oooO0OO.OooO0oO(i3, 4, i2, 4, 0);
        getWindow().setSoftInputMode(16);
        if (!zIsAppSpanned) {
            oooO0OO.f64007OooO0o.remove(Integer.valueOf(i3));
        } else if (z) {
            int iWidth = getHinge(this, rotation).width() / 2;
            int i4 = C18549R.id.vertical_guideline;
            oooO0OO.OooO0oO(i, 1, i4, 2, iWidth);
            oooO0OO.OooO0oO(i3, 2, i4, 1, 0);
        } else {
            int iHeight = getHinge(this, rotation).height() / 2;
            int i5 = C18549R.id.horizontal_guideline;
            oooO0OO.OooO0oO(i, 4, i5, 3, iHeight);
            oooO0OO.OooO0oO(i3, 3, i5, 4, 0);
            getWindow().setSoftInputMode(48);
        }
        ((ConstraintLayout) findViewById(i2)).setConstraintSet(oooO0OO);
    }

    private Rect getHinge(Context context, int i) {
        List<Rect> boundingRectsForRotation = DisplayMask.fromResourcesRect(context).getBoundingRectsForRotation(i);
        return boundingRectsForRotation.size() == 0 ? new Rect(0, 0, 0, 0) : boundingRectsForRotation.get(0);
    }

    private Rect getWindowRect(Activity activity) {
        Rect rect = new Rect();
        activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        return rect;
    }

    private void initializeContentView() {
        super.setContentView(C18549R.layout.dual_screen_layout);
        adjustLayoutForDualScreenActivity();
    }

    private boolean isDualScreenDevice(Context context) {
        return context.getPackageManager().hasSystemFeature("com.microsoft.device.display.displaymask");
    }

    public int getRotation(Activity activity) {
        WindowManager windowManager = (WindowManager) activity.getSystemService("window");
        if (windowManager != null) {
            return windowManager.getDefaultDisplay().getRotation();
        }
        return 0;
    }

    public boolean isAppSpanned(Activity activity) {
        if (!isDualScreenDevice(activity)) {
            return false;
        }
        Rect hinge = getHinge(activity, getRotation(activity));
        Rect windowRect = getWindowRect(activity);
        if (windowRect.width() <= 0 || windowRect.height() <= 0) {
            return false;
        }
        return hinge.intersect(windowRect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // OooO0Oo.OooOO0O, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super/*android.os.Bundle*/.getLong(configuration);
        adjustLayoutForDualScreenActivity();
    }

    @Override // OooO0Oo.OooOO0O, android.app.Activity
    public void setContentView(int i) {
        initializeContentView();
        LayoutInflater.from(this).inflate(i, (RelativeLayout) findViewById(C18549R.id.dual_screen_content));
    }

    public void setFragment(Fragment fragment) {
        initializeContentView();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        OooO00o oooO00oOooO0OO = OooOOO0.OooO0OO(supportFragmentManager, supportFragmentManager);
        oooO00oOooO0OO.OooO0o0(fragment, C18549R.id.dual_screen_content);
        oooO00oOooO0OO.OooO0oo();
    }
}
