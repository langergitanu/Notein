package o0oOoOo;

import com.orion.notein.p607ui.p609vo.NoteVO;
import java.text.Collator;
import java.util.List;
import java.util.Locale;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0O.C33576OooOOOo;
import oO0o0O0o.C33588OooOO0;
import oO0o0O0o.C33596OooOOo0;
import oO0o0OO.InterfaceC33625OooOoO;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: o0oOoOo.o000oOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C31090o000oOoO implements InterfaceC32508OooOOOo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f110964OooOo0o;

    public /* synthetic */ C31090o000oOoO(int i) {
        this.f110964OooOo0o = i;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(Object obj, Object obj2) {
        int iOooO;
        switch (this.f110964OooOo0o) {
            case 0:
                C31076OoooOOO f1 = (C31076OoooOOO) obj;
                C31076OoooOOO f2 = (C31076OoooOOO) obj2;
                kotlin.jvm.internal.OooOOO0.OooO0oO(f1, "f1");
                kotlin.jvm.internal.OooOOO0.OooO0oO(f2, "f2");
                NoteVO.INSTANCE.getClass();
                List listOooOo0 = C33576OooOOOo.OooOo0(C33576OooOOOo.OooOOoo(C33588OooOO0.OooO00o(NoteVO.nameDigitExtractor, f1.f110901OooO0Oo), new C31068Oooo0o0()));
                List listOooOo02 = C33576OooOOOo.OooOo0(C33576OooOOOo.OooOOoo(C33588OooOO0.OooO00o(NoteVO.nameDigitExtractor, f2.f110901OooO0Oo), new C31067Oooo0o(0)));
                int size = listOooOo0.size();
                int size2 = listOooOo02.size();
                if (size > size2) {
                    size = size2;
                }
                int i = 0;
                while (true) {
                    if (i < size) {
                        if (!kotlin.jvm.internal.OooOOO0.OooO0O0(listOooOo0.get(i), listOooOo02.get(i))) {
                            Integer numOooOOO0 = C33596OooOOo0.OooOOO0((String) listOooOo0.get(i));
                            Integer numOooOOO02 = C33596OooOOo0.OooOOO0((String) listOooOo02.get(i));
                            if (numOooOOO0 == null || numOooOOO02 == null) {
                                iOooO = Collator.getInstance(Locale.CHINESE).compare((String) listOooOo0.get(i), (String) listOooOo02.get(i));
                                if (iOooO != 0) {
                                }
                            } else {
                                iOooO = kotlin.jvm.internal.OooOOO0.OooO(numOooOOO0.intValue(), numOooOOO02.intValue());
                                if (iOooO != 0) {
                                }
                            }
                        }
                        i++;
                    } else {
                        iOooO = kotlin.jvm.internal.OooOOO0.OooO(listOooOo0.size(), listOooOo02.size());
                    }
                }
                return Integer.valueOf(iOooO);
            default:
                InterfaceC34415OooO0oo interfaceC34415OooO0oo = (InterfaceC34415OooO0oo) obj;
                InterfaceC34415OooO0oo.OooO0O0 oooO0O0 = (InterfaceC34415OooO0oo.OooO0O0) obj2;
                return oooO0O0 instanceof InterfaceC33625OooOoO ? interfaceC34415OooO0oo.plus(((InterfaceC33625OooOoO) oooO0O0).Oooo000()) : interfaceC34415OooO0oo.plus(oooO0O0);
        }
    }
}
