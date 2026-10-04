package o0oooO0O;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import o0ooO0OO.C31431OooO00o;
import o0ooO0Oo.AbstractC31434OooO0O0;
import o0ooO0Oo.AbstractC31443OooOO0o;
import o0ooO0Oo.C31433OooO00o;
import o0ooO0Oo.C31441OooOO0;
import o0ooO0Oo.C31450OooOOoo;
import o0ooO0oo.C31491OooO0oO;
import o0ooOO0o.C31610OooO;
import o0ooo0.AbstractC31720OooOOOo;
import o0ooo0o.AbstractC31763OooO0O0;
import o0ooo0o.C31762OooO00o;
import o0ooo0o.C31764OooO0OO;
import o0ooo0o.C31765OooO0Oo;

/* JADX INFO: renamed from: o0oooO0O.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31816OooO0oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C31610OooO f113438OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C31441OooOO0 f113439OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final AbstractC31720OooOOOo f113440OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f113441OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public C31762OooO00o f113442OooO0o0;

    public C31816OooO0oO(C31450OooOOoo c31450OooOOoo, C31610OooO c31610OooO) throws IOException {
        this.f113441OooO0Oo = 12.0f;
        if (c31450OooOOoo == null) {
            throw new IllegalArgumentException("/DA is a required entry. Please set a default appearance first.");
        }
        if (c31610OooO == null) {
            throw new IllegalArgumentException("/DR is a required entry");
        }
        this.f113438OooO00o = c31610OooO;
        byte[] bArr = c31450OooOOoo.f112480OooOo;
        ArrayList arrayList = new ArrayList();
        C31491OooO0oO c31491OooO0oO = new C31491OooO0oO(bArr);
        for (Object objOooOo0O = c31491OooO0oO.OooOo0O(); objOooOo0O != null; objOooOo0O = c31491OooO0oO.OooOo0O()) {
            if (objOooOo0O instanceof C31431OooO00o) {
                String str = ((C31431OooO00o) objOooOo0O).f112205OooO00o;
                if ("Tf".equals(str)) {
                    if (arrayList.size() < 2) {
                        throw new IOException("Missing operands for set font operator " + Arrays.toString(arrayList.toArray()));
                    }
                    AbstractC31434OooO0O0 abstractC31434OooO0O0 = (AbstractC31434OooO0O0) arrayList.get(0);
                    AbstractC31434OooO0O0 abstractC31434OooO0O02 = (AbstractC31434OooO0O0) arrayList.get(1);
                    if ((abstractC31434OooO0O0 instanceof C31441OooOO0) && (abstractC31434OooO0O02 instanceof AbstractC31443OooOO0o)) {
                        C31441OooOO0 c31441OooOO0 = (C31441OooOO0) abstractC31434OooO0O0;
                        AbstractC31720OooOOOo abstractC31720OooOOOoOooO0O0 = this.f113438OooO00o.OooO0O0(c31441OooOO0);
                        float fOooOooo = ((AbstractC31443OooOO0o) abstractC31434OooO0O02).OooOooo();
                        if (abstractC31720OooOOOoOooO0O0 == null) {
                            throw new IOException("Could not find font: /" + c31441OooOO0.f112461OooOo);
                        }
                        this.f113439OooO0O0 = c31441OooOO0;
                        this.f113440OooO0OO = abstractC31720OooOOOoOooO0O0;
                        this.f113441OooO0Oo = fOooOooo;
                    }
                } else if ("g".equals(str) || "rg".equals(str) || "k".equals(str)) {
                    OooO00o(arrayList);
                }
                arrayList = new ArrayList();
            } else {
                arrayList.add((AbstractC31434OooO0O0) objOooOo0O);
            }
        }
    }

    public final void OooO00o(ArrayList arrayList) throws IOException {
        AbstractC31763OooO0O0 abstractC31763OooO0O0;
        int size = arrayList.size();
        if (size == 1) {
            abstractC31763OooO0O0 = C31764OooO0OO.f113413OooOo0o;
        } else {
            if (size != 3 && size != 4) {
                throw new IOException("Missing operands for set non stroking color operator " + Arrays.toString(arrayList.toArray()));
            }
            abstractC31763OooO0O0 = C31765OooO0Oo.f113414OooOo;
        }
        C31433OooO00o c31433OooO00o = new C31433OooO00o();
        c31433OooO00o.f112214OooOo.addAll(arrayList);
        this.f113442OooO0o0 = new C31762OooO00o(c31433OooO00o, abstractC31763OooO0O0);
    }
}
