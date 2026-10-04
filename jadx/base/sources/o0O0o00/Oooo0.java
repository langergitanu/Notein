package o0O0o00;

import com.orion.editor.PDFView;
import com.orion.penkit.models.DrawRecord;
import java.util.function.Predicate;
import o0oo0o.InterfaceC31284OooO0O0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class Oooo0 implements Predicate {
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        InterfaceC31284OooO0O0 interfaceC31284OooO0O0 = (InterfaceC31284OooO0O0) obj;
        int i = PDFView.f69162o000o00O;
        return (interfaceC31284OooO0O0 instanceof DrawRecord) && ((DrawRecord) interfaceC31284OooO0O0).getType() == 10;
    }
}
