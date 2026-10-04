package androidx.core.view;

import Oooo0oO.C21030OooOO0o;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.util.Supplier;
import androidx.fragment.app.InterfaceC21912Oooo0o;
import com.orion.notein.p607ui.paperconfig.MyTemplateFragment;
import java.util.ArrayList;
import o0Oo00o.C28026OooO0OO;

/* JADX INFO: renamed from: androidx.core.view.Oooo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C21715Oooo00o implements Supplier, InterfaceC21912Oooo0o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f64292OooOo0o;

    public /* synthetic */ C21715Oooo00o(Object obj) {
        this.f64292OooOo0o = obj;
    }

    @Override // androidx.fragment.app.InterfaceC21912Oooo0o
    public void OooO0OO(Bundle bundle, String str) {
        final Uri uri;
        final MyTemplateFragment myTemplateFragment;
        View view;
        kotlin.jvm.internal.OooOOO0.OooO0oO(bundle, "bundle");
        ArrayList parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? bundle.getParcelableArrayList("pdf_uri_list", Uri.class) : bundle.getParcelableArrayList("pdf_uri_list");
        if (parcelableArrayList == null || (uri = (Uri) oOo000Oo.OooOo.Oooo(parcelableArrayList)) == null || (view = (myTemplateFragment = (MyTemplateFragment) this.f64292OooOo0o).getView()) == null) {
            return;
        }
        view.post(new Runnable() { // from class: o0o0OOO.OooOo00
            @Override // java.lang.Runnable
            public final void run() {
                MyTemplateFragment myTemplateFragment2 = myTemplateFragment;
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(myTemplateFragment2), new C30502OoooO0(uri));
            }
        });
    }

    @Override // androidx.core.util.Supplier
    public Object get() {
        return Integer.valueOf(((ViewConfiguration) this.f64292OooOo0o).getScaledMinimumFlingVelocity());
    }
}
