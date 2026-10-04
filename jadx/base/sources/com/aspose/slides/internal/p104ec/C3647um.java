package com.aspose.slides.internal.p104ec;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p356qb.C9820h4;
import com.aspose.slides.internal.p505xn.C12555c5;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14058fa;

/* JADX INFO: renamed from: com.aspose.slides.internal.ec.um */
/* JADX INFO: loaded from: classes3.dex */
public class C3647um {

    /* JADX INFO: renamed from: k4 */
    private final C3604ck f10113k4;

    /* JADX INFO: renamed from: kk */
    private String f10114kk;

    /* JADX INFO: renamed from: x1 */
    private final C3664yj f10115x1;

    public C3647um(C3664yj c3664yj, C3604ck c3604ck) {
        if (c3664yj == null) {
            throw new ArgumentNullException();
        }
        if (c3604ck == null) {
            throw new ArgumentNullException();
        }
        this.f10115x1 = c3664yj;
        this.f10113k4 = c3604ck;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m14808k4() {
        return this.f10114kk;
    }

    /* JADX INFO: renamed from: kk */
    public final C3604ck m14811kk() {
        return this.f10113k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C3664yj m14812x1() {
        return this.f10115x1;
    }

    public C3647um(C9820h4 c9820h4, C3664yj c3664yj, C3604ck c3604ck) {
        if (c9820h4 == null) {
            throw new ArgumentNullException();
        }
        if (c3664yj == null) {
            throw new ArgumentNullException();
        }
        if (c3604ck == null) {
            throw new ArgumentNullException();
        }
        this.f10115x1 = c3664yj;
        this.f10113k4 = c3604ck;
        m14807k4(c9820h4.m48413x1());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m14809k4(C9820h4 c9820h4) {
        List list = new List(AbstractC14092to.m67204k4((Object[]) C3085sv.m13099k4(C12555c5.m58552k4(this.f10113k4.m14706k4().m14839k4().m14815x1() & 65535).mo26677to(this.f10114kk))));
        list.addItem((byte) 0);
        c9820h4.m48409k4(C3628m2.m14776x1(C3085sv.m13110x1((List<Byte>) list)));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m14810k4(String str) {
        this.f10114kk = str;
    }

    /* JADX INFO: renamed from: k4 */
    private void m14807k4(byte[] bArr) {
        int length = (int) ((((long) bArr.length) - (this.f10115x1.m14862x1().m14806x1() & 4294967295L)) & 4294967295L);
        byte[] bArr2 = new byte[length];
        C14058fa.m66593k4(AbstractC14092to.m67208k4((Object) bArr), (int) this.f10115x1.m14862x1().m14806x1(), AbstractC14092to.m67208k4((Object) bArr2), 0, length);
        this.f10114kk = C3624kk.m14768k4(C3628m2.m14773k4(bArr2), this.f10113k4.m14706k4().m14839k4().m14815x1() & 65535);
    }
}
