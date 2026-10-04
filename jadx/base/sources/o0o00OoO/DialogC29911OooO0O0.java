package o0o00OoO;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.orion.notein.p607ui.p609vo.PenColorVO;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o0Oo00oO.C28038OooO0Oo;
import o0o00Ooo.C29920OooO0oo;
import o0o00o0.C29935OooO0o0;
import o0o00o0.InterfaceC29930OooO00o;
import o0o00oO0.C29990OooO0oO;
import o0oOo0o0.DialogC30986OooO0oo;

/* JADX INFO: renamed from: o0o00OoO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class DialogC29911OooO0O0 extends DialogC30986OooO0oo implements InterfaceC29930OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C29990OooO0oO f106125OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public C29935OooO0o0 f106126OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public PenColorVO f106127OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f106128OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public List<C29920OooO0oo> f106129OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f106130OooOoo0;

    @Override // o0o00o0.InterfaceC29930OooO00o
    public final void OooOOo(List<C29920OooO0oo> list) {
        OooOOO0.OooO0oO(list, "list");
        this.f106129OooOoo = list;
        C29990OooO0oO c29990OooO0oO = this.f106125OooOo;
        if (c29990OooO0oO != null) {
            c29990OooO0oO.OooOOo(list);
        }
    }

    @Override // o0oOo0o0.DialogC30986OooO0oo, com.google.android.material.bottomsheet.BottomSheetDialog, androidx.appcompat.app.DialogC21495OooOoO, OooO0Oo.OooOo00, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        C29990OooO0oO c29990OooO0oO;
        super.onCreate(bundle);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o0o00OoO.OooO00o
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C29990OooO0oO c29990OooO0oO2 = this.f106124OooOo0o.f106125OooOo;
                if (c29990OooO0oO2 != null) {
                    c29990OooO0oO2.onDismiss();
                }
            }
        });
        View view = this.f110684OooOo0o;
        Context context = view.getContext();
        OooOOO0.OooO0o(context, "getContext(...)");
        C29990OooO0oO c29990OooO0oO2 = new C29990OooO0oO(C28038OooO0Oo.OooO00o(context).f116638OooOo0o.intValue(), view);
        this.f106125OooOo = c29990OooO0oO2;
        PenColorVO penColorVO = this.f106127OooOoO0;
        c29990OooO0oO2.f106537Oooo0o = this.f106126OooOoO;
        if (penColorVO != null) {
            c29990OooO0oO2.OooO00o(penColorVO);
        }
        C29990OooO0oO c29990OooO0oO3 = this.f106125OooOo;
        if (c29990OooO0oO3 != null) {
            c29990OooO0oO3.OooO0O0(this.f106128OooOoOO);
        }
        C29990OooO0oO c29990OooO0oO4 = this.f106125OooOo;
        if (c29990OooO0oO4 != null) {
            c29990OooO0oO4.OooO0Oo(this.f106130OooOoo0);
        }
        List<C29920OooO0oo> list = this.f106129OooOoo;
        if (list == null || (c29990OooO0oO = this.f106125OooOo) == null) {
            return;
        }
        c29990OooO0oO.OooOOo(list);
    }

    @Override // o0o00o0.InterfaceC29930OooO00o
    public final void onDismiss() {
        C29990OooO0oO c29990OooO0oO = this.f106125OooOo;
        if (c29990OooO0oO != null) {
            c29990OooO0oO.onDismiss();
        }
    }
}
