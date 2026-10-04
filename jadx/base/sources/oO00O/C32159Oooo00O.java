package oO00O;

import com.aspose.words.internal.C22245OooO0oO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o00OooO.C25139OooOOOo;
import o00OooO0.C25150OooO00o;
import o00oo0O0.C25667OooOO0o;
import oO00O.EnumC32175OoooOoO;
import oO00Oo0.C32266OooO0Oo;
import oO00Oo0.C32269OooO0oo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O0OOO.C32651OooO0o0;
import oO0O0OOO.EnumC32650OooO0Oo;
import oO0o0O0o.C33580OooO00o;

/* JADX INFO: renamed from: oO00O.Oooo00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32159Oooo00O extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<oO00Oo0.OooO0OO, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C32161Oooo0O0 f115365OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32159Oooo00O(C32161Oooo0O0 c32161Oooo0O0) {
        super(1);
        this.f115365OooOo0o = c32161Oooo0O0;
    }

    /* JADX WARN: Finally extract failed */
    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final C32460OooOooO invoke(oO00Oo0.OooO0OO oooO0OO) throws C32269OooO0oo {
        oO00Oo0.OooO0OO sendHandshakeRecord = oooO0OO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(sendHandshakeRecord, "$this$sendHandshakeRecord");
        EnumC32175OoooOoO.OooO00o oooO00o = EnumC32175OoooOoO.f115436OooOo;
        C32161Oooo0O0 c32161Oooo0O0 = this.f115365OooOo0o;
        C32163Oooo0o c32163Oooo0o = c32161Oooo0O0.f115368OooOo0o;
        ArrayList suites = c32163Oooo0o.f115384OooO0Oo;
        kotlin.jvm.internal.OooOOO0.OooO0oO(suites, "suites");
        byte[] random = c32161Oooo0O0.f115369OooOoO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(random, "random");
        C25139OooOOOo.OooO0o0(sendHandshakeRecord, (short) 771);
        int iOooo0 = 0;
        C25667OooOO0o.OooO0Oo(sendHandshakeRecord, random, 0, random.length);
        sendHandshakeRecord.o00000oO((byte) 32);
        C25667OooOO0o.OooO0Oo(sendHandshakeRecord, new byte[32], 0, 32);
        C25139OooOOOo.OooO0o0(sendHandshakeRecord, (short) (suites.size() * 2));
        Iterator it = suites.iterator();
        while (it.hasNext()) {
            C25139OooOOOo.OooO0o0(sendHandshakeRecord, ((C32139OooO0Oo) it.next()).f115246OooO00o);
        }
        sendHandshakeRecord.o00000oO((byte) 1);
        sendHandshakeRecord.o00000oO((byte) 0);
        ArrayList<C32266OooO0Oo> arrayList = new ArrayList();
        List<oO0O0OOO.OooO00o> list = oO0O0OOO.OooO0o.f117324OooO00o;
        oO00Oo0.OooO0OO oooO0OO2 = new oO00Oo0.OooO0OO(null);
        try {
            C25139OooOOOo.OooO0o0(oooO0OO2, (short) 13);
            int size = list.size() * 2;
            C25139OooOOOo.OooO0o0(oooO0OO2, (short) (size + 2));
            C25139OooOOOo.OooO0o0(oooO0OO2, (short) size);
            for (oO0O0OOO.OooO00o oooO00o2 : list) {
                oooO0OO2.o00000oO(C22245OooO0oO.OooO00o(oooO00o2.f117309OooO00o));
                oooO0OO2.o00000oO(androidx.concurrent.futures.OooO0o.OooO00o(oooO00o2.f117310OooO0O0));
            }
            arrayList.add(oooO0OO2.ooOO());
            List<oO0O0OOO.OooO0O0> list2 = oO0O0OOO.OooO0OO.f117318OooO00o;
            oooO0OO2 = new oO00Oo0.OooO0OO(null);
            try {
                if (list2.size() > 16382) {
                    throw new IllegalArgumentException("Too many named curves provided: at most 16382 could be provided");
                }
                C25139OooOOOo.OooO0o0(oooO0OO2, (short) 10);
                int size2 = list2.size() * 2;
                C25139OooOOOo.OooO0o0(oooO0OO2, (short) (size2 + 2));
                C25139OooOOOo.OooO0o0(oooO0OO2, (short) size2);
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    C25139OooOOOo.OooO0o0(oooO0OO2, ((oO0O0OOO.OooO0O0) it2.next()).f117317OooOo0o);
                }
                arrayList.add(oooO0OO2.ooOO());
                List<EnumC32650OooO0Oo> list3 = C32651OooO0o0.f117325OooO00o;
                oooO0OO2 = new oO00Oo0.OooO0OO(null);
                try {
                    C25139OooOOOo.OooO0o0(oooO0OO2, (short) 11);
                    int size3 = list3.size();
                    C25139OooOOOo.OooO0o0(oooO0OO2, (short) (1 + size3));
                    oooO0OO2.o00000oO((byte) size3);
                    Iterator<T> it3 = list3.iterator();
                    while (it3.hasNext()) {
                        oooO0OO2.o00000oO(((EnumC32650OooO0Oo) it3.next()).f117323OooOo0o);
                    }
                    arrayList.add(oooO0OO2.ooOO());
                    String str = c32163Oooo0o.f115385OooO0o0;
                    if (str != null) {
                        oooO0OO2 = new oO00Oo0.OooO0OO(null);
                        try {
                            if (str.length() >= 32762) {
                                throw new IllegalArgumentException("Server name length limit exceeded: at most 32762 characters allowed");
                            }
                            C25139OooOOOo.OooO0o0(oooO0OO2, (short) 0);
                            C25139OooOOOo.OooO0o0(oooO0OO2, (short) (str.length() + 5));
                            C25139OooOOOo.OooO0o0(oooO0OO2, (short) (str.length() + 3));
                            oooO0OO2.o00000oO((byte) 0);
                            C25139OooOOOo.OooO0o0(oooO0OO2, (short) str.length());
                            C25150OooO00o.OooO(oooO0OO2, str, 0, str.length(), C33580OooO00o.f121231OooO0O0);
                            arrayList.add(oooO0OO2.ooOO());
                        } finally {
                            oooO0OO2.close();
                        }
                    }
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        iOooo0 += (int) ((C32266OooO0Oo) it4.next()).Oooo0();
                    }
                    C25139OooOOOo.OooO0o0(sendHandshakeRecord, (short) iOooo0);
                    for (C32266OooO0Oo e : arrayList) {
                        kotlin.jvm.internal.OooOOO0.OooO0o(e, "e");
                        sendHandshakeRecord.o0000oO(e);
                    }
                    return C32460OooOooO.f116667OooO00o;
                } catch (Throwable th) {
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
