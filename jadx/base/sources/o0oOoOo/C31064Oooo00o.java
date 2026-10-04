package o0oOoOo;

import com.orion.notein.p607ui.p609vo.NoteVO;
import java.text.Collator;
import java.util.List;
import java.util.Locale;
import o0O0oOO0.C26114OooO0O0;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0O.C33576OooOOOo;
import oO0o0O0o.C33588OooOO0;
import oO0o0O0o.C33596OooOOo0;

/* JADX INFO: renamed from: o0oOoOo.Oooo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C31064Oooo00o implements InterfaceC32508OooOOOo {
    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(Object obj, Object obj2) {
        int iOooO;
        C31076OoooOOO f1 = (C31076OoooOOO) obj;
        C31076OoooOOO f2 = (C31076OoooOOO) obj2;
        kotlin.jvm.internal.OooOOO0.OooO0oO(f1, "f1");
        kotlin.jvm.internal.OooOOO0.OooO0oO(f2, "f2");
        NoteVO.INSTANCE.getClass();
        List listOooOo0 = C33576OooOOOo.OooOo0(C33576OooOOOo.OooOOoo(C33588OooOO0.OooO00o(NoteVO.nameDigitExtractor, f2.f110901OooO0Oo), new C31065Oooo0O0(0)));
        List listOooOo02 = C33576OooOOOo.OooOo0(C33576OooOOOo.OooOOoo(C33588OooOO0.OooO00o(NoteVO.nameDigitExtractor, f1.f110901OooO0Oo), new C26114OooO0O0(1)));
        int size = listOooOo0.size();
        int size2 = listOooOo02.size();
        if (size > size2) {
            size = size2;
        }
        int i = 0;
        while (true) {
            if (i >= size) {
                iOooO = kotlin.jvm.internal.OooOOO0.OooO(listOooOo0.size(), listOooOo02.size());
                break;
            }
            if (!kotlin.jvm.internal.OooOOO0.OooO0O0(listOooOo0.get(i), listOooOo02.get(i))) {
                Integer numOooOOO0 = C33596OooOOo0.OooOOO0((String) listOooOo0.get(i));
                Integer numOooOOO02 = C33596OooOOo0.OooOOO0((String) listOooOo02.get(i));
                if (numOooOOO0 == null || numOooOOO02 == null) {
                    iOooO = Collator.getInstance(Locale.CHINESE).compare((String) listOooOo0.get(i), (String) listOooOo02.get(i));
                    if (iOooO != 0) {
                        break;
                    }
                } else {
                    iOooO = kotlin.jvm.internal.OooOOO0.OooO(numOooOOO0.intValue(), numOooOOO02.intValue());
                    if (iOooO != 0) {
                        break;
                    }
                }
            }
            i++;
        }
        return Integer.valueOf(iOooO);
    }
}
