package o00000;

import OooO0Oo.C20398OooO0O0;
import com.aspose.slides.C22218Oooo;
import kotlin.jvm.internal.C24035Oooo00o;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o00000.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24047OooO0oO extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<OooO0o, CharSequence> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C24048OooO0oo f81038OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ OooO0o f81039OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24047OooO0oO(OooO0o oooO0o, C24048OooO0oo c24048OooO0oo) {
        super(1);
        this.f81039OooOo0o = oooO0o;
        this.f81038OooOo = c24048OooO0oo;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final CharSequence invoke(OooO0o oooO0o) {
        String strConcat;
        OooO0o it = oooO0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
        StringBuilder sbOooO0OO = C22218Oooo.OooO0OO(this.f81039OooOo0o == it ? " > " : "   ");
        this.f81038OooOo.getClass();
        if (it instanceof OooO0O0) {
            StringBuilder sb = new StringBuilder("CommitTextCommand(text.length=");
            OooO0O0 oooO0O0 = (OooO0O0) it;
            sb.append(oooO0O0.f81032OooO00o.f124887OooOo0o.length());
            sb.append(", newCursorPosition=");
            strConcat = C20398OooO0O0.OooO00o(')', sb, oooO0O0.f81033OooO0O0);
        } else if (it instanceof C24065Oooo00O) {
            StringBuilder sb2 = new StringBuilder("SetComposingTextCommand(text.length=");
            C24065Oooo00O c24065Oooo00O = (C24065Oooo00O) it;
            sb2.append(c24065Oooo00O.f81088OooO00o.f124887OooOo0o.length());
            sb2.append(", newCursorPosition=");
            strConcat = C20398OooO0O0.OooO00o(')', sb2, c24065Oooo00O.f81089OooO0O0);
        } else if ((it instanceof Oooo000) || (it instanceof C24045OooO0Oo) || (it instanceof C24046OooO0o0) || (it instanceof C24066Oooo00o)) {
            strConcat = it.toString();
        } else if (it instanceof OooOO0O) {
            strConcat = "FinishComposingTextCommand()";
        } else if (it instanceof OooO0OO) {
            strConcat = "DeleteAllCommand()";
        } else {
            String strOooOO0 = C24035Oooo00o.f80943OooO00o.OooO0O0(it.getClass()).OooOO0();
            if (strOooOO0 == null) {
                strOooOO0 = "{anonymous EditCommand}";
            }
            strConcat = "Unknown EditCommand: ".concat(strOooOO0);
        }
        sbOooO0OO.append(strConcat);
        return sbOooO0OO.toString();
    }
}
