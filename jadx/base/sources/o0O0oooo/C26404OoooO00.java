package o0O0oooo;

import android.content.Context;
import com.orion.editor.AbstractC22830OooO0Oo;
import com.orion.editor.PDFView;
import o0O0o00.C25936OooOoo0;
import o0O0o00.o000O000;
import o0O0oOO.C26111OooO0oO;
import o0O0oOO.EnumC26107OooO0OO;
import o0OOo0o.C27449o00O0OoO;
import o0OOooO.C27881OooOO0O;
import o0OoO0oo.C28694OooOO0O;
import o0OoO0oo.InterfaceC28962o00oOoOo;

/* JADX INFO: renamed from: o0O0oooo.OoooO00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26404OoooO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C28694OooOO0O f90614OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C27449o00O0OoO f90615OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C27881OooOO0O f90616OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Integer f90617OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final InterfaceC28962o00oOoOo f90618OooO0o0;

    public C26404OoooO00(C28694OooOO0O note, C27449o00O0OoO noteUseCase, C27881OooOO0O pageLayerUseCase, Integer num, InterfaceC28962o00oOoOo listener) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(note, "note");
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteUseCase, "noteUseCase");
        kotlin.jvm.internal.OooOOO0.OooO0oO(pageLayerUseCase, "pageLayerUseCase");
        kotlin.jvm.internal.OooOOO0.OooO0oO(listener, "listener");
        this.f90614OooO00o = note;
        this.f90615OooO0O0 = noteUseCase;
        this.f90616OooO0OO = pageLayerUseCase;
        this.f90617OooO0Oo = num;
        this.f90618OooO0o0 = listener;
    }

    public final AbstractC22830OooO0Oo OooO00o(PDFView pDFView, EnumC26107OooO0OO enumC26107OooO0OO, C26111OooO0oO c26111OooO0oO, boolean z, int i, boolean z2, boolean z3) {
        Integer num = this.f90617OooO0Oo;
        if (num.intValue() <= 0) {
            num = null;
        }
        Integer num2 = num;
        Context context = pDFView.getContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(context, "getContext(...)");
        C26395Oooo0o0 c26395Oooo0o0 = new C26395Oooo0o0(this.f90614OooO00o, this.f90615OooO0O0, this.f90616OooO0OO, i, num2, context, this.f90618OooO0o0);
        return this.f90614OooO00o.f101666OooO ? new o000O000(pDFView, c26395Oooo0o0, c26111OooO0oO) : new C25936OooOoo0(pDFView, c26395Oooo0o0, enumC26107OooO0OO, c26111OooO0oO, z, i, z2, z3);
    }
}
