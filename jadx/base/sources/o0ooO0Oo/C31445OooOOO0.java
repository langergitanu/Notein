package o0ooO0Oo;

import Oooo0oO.C21023OooO0Oo;
import java.io.IOException;
import o0ooOO0O.C31607OooO0O0;

/* JADX INFO: renamed from: o0ooO0Oo.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31445OooOOO0 extends AbstractC31434OooO0O0 implements InterfaceC31452OooOo00 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public AbstractC31434OooO0O0 f112467OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f112468OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public long f112469OooOoO0;

    public C31445OooOOO0(AbstractC31434OooO0O0 abstractC31434OooO0O0) throws IOException {
        this.f112467OooOo = abstractC31434OooO0O0;
    }

    @Override // o0ooO0Oo.InterfaceC31452OooOo00
    public final boolean OooO0OO() {
        return false;
    }

    @Override // o0ooO0Oo.AbstractC31434OooO0O0
    public final Object OooOOoo(C31607OooO0O0 c31607OooO0O0) throws IOException {
        AbstractC31434OooO0O0 abstractC31434OooO0O0 = this.f112467OooOo;
        if (abstractC31434OooO0O0 != null) {
            return abstractC31434OooO0O0.OooOOoo(c31607OooO0O0);
        }
        C31442OooOO0O.f112464OooOoO0.OooOOoo(c31607OooO0O0);
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("COSObject{");
        sb.append(this.f112469OooOoO0);
        sb.append(", ");
        return C21023OooO0Oo.OooO0OO("}", this.f112468OooOoO, sb);
    }
}
