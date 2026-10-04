package com.google.android.material.datepicker;

import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.orion.notein.p607ui.login.firebase.FirebaseUserModifyPasswordFragment;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class OooO0OO implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f67697OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f67698OooO0O0;

    public /* synthetic */ OooO0OO(Object obj, int i) {
        this.f67697OooO00o = i;
        this.f67698OooO0O0 = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.f67697OooO00o) {
            case 0:
                DateSelector.lambda$showKeyboardWithAutoHideBehavior$0((EditText[]) this.f67698OooO0O0, view, z);
                return;
            default:
                ViewGroup viewGroup = ((FirebaseUserModifyPasswordFragment) this.f67698OooO0O0).f72392Oooo0O0;
                if (viewGroup != null) {
                    viewGroup.setActivated(z);
                    return;
                } else {
                    OooOOO0.OooOOOO("newPasswordWrapper");
                    throw null;
                }
        }
    }
}
