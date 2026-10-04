package o0oo0o00;

import OooOooO.C20733OooOO0O;
import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: renamed from: o0oo0o00.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC31307OooOo0 implements Closeable, Flushable {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f111784OooOoOO;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f111781OooOo0o = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int[] f111780OooOo = new int[32];

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public String[] f111783OooOoO0 = new String[32];

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int[] f111782OooOoO = new int[32];

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f111785OooOoo0 = -1;

    public final String OooO00o() {
        return C20733OooOO0O.OooO0O0(this.f111781OooOo0o, this.f111780OooOo, this.f111783OooOoO0, this.f111782OooOoO);
    }

    public final int OooO0OO() {
        int i = this.f111781OooOo0o;
        if (i != 0) {
            return this.f111780OooOo[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void OooOOO0(int i) {
        int[] iArr = this.f111780OooOo;
        int i2 = this.f111781OooOo0o;
        this.f111781OooOo0o = i2 + 1;
        iArr[i2] = i;
    }
}
