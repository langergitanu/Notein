package androidx.core.view;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ViewConfiguration;
import androidx.core.util.Supplier;
import androidx.fragment.app.InterfaceC21912Oooo0o;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.google.firebase.inappmessaging.internal.ProgramaticContextualTriggers;
import com.google.firebase.inappmessaging.internal.RateLimiterClient;
import com.orion.notein.p607ui.label.LabelManagementDialogFragment;
import com.orion.notein.p607ui.paperconfig.MyTemplateFragment;
import o0o0OOO.C30481OooOoO;
import oO00o00o.InterfaceC32330OooO0O0;
import oO0OooOO.InterfaceC33490OooO0o;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: renamed from: androidx.core.view.Oooo00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C21714Oooo00O implements Supplier, InterfaceC32330OooO0O0, ProgramaticContextualTriggers.Listener, InterfaceC21912Oooo0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f64290OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f64291OooOo0o;

    public /* synthetic */ C21714Oooo00O(Object obj, int i) {
        this.f64291OooOo0o = i;
        this.f64290OooOo = obj;
    }

    @Override // androidx.fragment.app.InterfaceC21912Oooo0o
    public void OooO0OO(Bundle bundle, String str) {
        switch (this.f64291OooOo0o) {
            case 3:
                kotlin.jvm.internal.OooOOO0.OooO0oO(bundle, "bundle");
                long j = bundle.getLong("labelId");
                LabelManagementDialogFragment labelManagementDialogFragment = (LabelManagementDialogFragment) this.f64290OooOo;
                InterfaceC21987OooOoo viewLifecycleOwner = labelManagementDialogFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new LabelManagementDialogFragment.OooO00o(labelManagementDialogFragment, j, null), 3);
                break;
            default:
                kotlin.jvm.internal.OooOOO0.OooO0oO(bundle, "bundle");
                int i = bundle.getInt("page_num");
                Parcelable parcelable = bundle.getParcelable("pdf_uri");
                Uri uri = parcelable instanceof Uri ? (Uri) parcelable : null;
                String string = bundle.getString("pdf_password");
                MyTemplateFragment myTemplateFragment = (MyTemplateFragment) this.f64290OooOo;
                InterfaceC21987OooOoo viewLifecycleOwner2 = myTemplateFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner2), null, null, new C30481OooOoO(myTemplateFragment, i, uri, string, null), 3);
                break;
        }
    }

    @Override // oO00o00o.InterfaceC32330OooO0O0
    public void accept(Object obj) throws Exception {
        ((RateLimiterClient) this.f64290OooOo).lambda$getRateLimits$7((Throwable) obj);
    }

    @Override // androidx.core.util.Supplier
    public Object get() {
        return Integer.valueOf(((ViewConfiguration) this.f64290OooOo).getScaledMaximumFlingVelocity());
    }

    @Override // com.google.firebase.inappmessaging.internal.ProgramaticContextualTriggers.Listener
    public void onEventTrigger(String str) {
        ((InterfaceC33490OooO0o) this.f64290OooOo).onNext(str);
    }
}
