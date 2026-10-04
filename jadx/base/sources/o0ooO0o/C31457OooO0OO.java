package o0ooO0o;

import androidx.appcompat.view.menu.C21505OooO0Oo;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: o0ooO0o.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31457OooO0OO implements InterfaceC31461OooO0oO, Closeable, Cloneable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public ArrayList f112497OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f112498OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public long f112499OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public byte[] f112500OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f112501OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f112502OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public long f112503OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f112504OooOooO;

    public final void OooO00o() throws IOException {
        if (this.f112500OooOoO0 == null) {
            throw new IOException("RandomAccessBuffer already closed");
        }
    }

    public final int OooO0OO(int i, int i2, byte[] bArr) {
        int iMin = (int) Math.min(i2, this.f112503OooOoo0 - this.f112499OooOoO);
        int i3 = this.f112501OooOoOO;
        int i4 = this.f112498OooOo0o - i3;
        if (i4 == 0) {
            return 0;
        }
        if (iMin >= i4) {
            System.arraycopy(this.f112500OooOoO0, i3, bArr, i, i4);
            this.f112501OooOoOO += i4;
            this.f112499OooOoO += (long) i4;
            return i4;
        }
        System.arraycopy(this.f112500OooOoO0, i3, bArr, i, iMin);
        this.f112501OooOoOO += iMin;
        this.f112499OooOoO += (long) iMin;
        return iMin;
    }

    @Override // o0ooO0o.InterfaceC31461OooO0oO
    public final byte[] OooO0oo(int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        do {
            int i3 = read(bArr, i2, i - i2);
            if (i3 < 0) {
                throw new EOFException();
            }
            i2 += i3;
        } while (i2 < i);
        return bArr;
    }

    @Override // o0ooO0o.InterfaceC31461OooO0oO
    public final boolean OooOOOo() throws IOException {
        OooO00o();
        return this.f112499OooOoO >= this.f112503OooOoo0;
    }

    @Override // o0ooO0o.InterfaceC31461OooO0oO
    public final void Ooooo00(int i) throws IOException {
        OooO00o();
        OooO00o();
        seek(this.f112499OooOoO - ((long) i));
    }

    public final Object clone() throws CloneNotSupportedException {
        C31457OooO0OO c31457OooO0OO = new C31457OooO0OO();
        c31457OooO0OO.f112498OooOo0o = 1024;
        c31457OooO0OO.f112497OooOo = null;
        ArrayList arrayList = new ArrayList();
        c31457OooO0OO.f112497OooOo = arrayList;
        int i = this.f112498OooOo0o;
        c31457OooO0OO.f112498OooOo0o = i;
        byte[] bArr = new byte[i];
        c31457OooO0OO.f112500OooOoO0 = bArr;
        arrayList.add(bArr);
        c31457OooO0OO.f112499OooOoO = 0L;
        c31457OooO0OO.f112501OooOoOO = 0;
        c31457OooO0OO.f112503OooOoo0 = 0L;
        c31457OooO0OO.f112502OooOoo = 0;
        c31457OooO0OO.f112504OooOooO = 0;
        c31457OooO0OO.f112497OooOo = new ArrayList(this.f112497OooOo.size());
        for (byte[] bArr2 : this.f112497OooOo) {
            byte[] bArr3 = new byte[bArr2.length];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
            c31457OooO0OO.f112497OooOo.add(bArr3);
        }
        if (this.f112500OooOoO0 != null) {
            c31457OooO0OO.f112500OooOoO0 = (byte[]) C21505OooO0Oo.OooO00o(1, c31457OooO0OO.f112497OooOo);
        } else {
            c31457OooO0OO.f112500OooOoO0 = null;
        }
        c31457OooO0OO.f112499OooOoO = this.f112499OooOoO;
        c31457OooO0OO.f112501OooOoOO = this.f112501OooOoOO;
        c31457OooO0OO.f112503OooOoo0 = this.f112503OooOoo0;
        c31457OooO0OO.f112502OooOoo = this.f112502OooOoo;
        c31457OooO0OO.f112504OooOooO = this.f112504OooOooO;
        return c31457OooO0OO;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f112500OooOoO0 = null;
        this.f112497OooOo.clear();
        this.f112499OooOoO = 0L;
        this.f112501OooOoOO = 0;
        this.f112503OooOoo0 = 0L;
        this.f112502OooOoo = 0;
    }

    @Override // o0ooO0o.InterfaceC31461OooO0oO
    public final long getPosition() throws IOException {
        OooO00o();
        return this.f112499OooOoO;
    }

    @Override // o0ooO0o.InterfaceC31461OooO0oO
    public final long length() throws IOException {
        OooO00o();
        return this.f112503OooOoo0;
    }

    @Override // o0ooO0o.InterfaceC31461OooO0oO
    public final int peek() throws IOException {
        int i;
        OooO00o();
        if (this.f112499OooOoO < this.f112503OooOoo0) {
            if (this.f112501OooOoOO >= this.f112498OooOo0o) {
                int i2 = this.f112502OooOoo;
                if (i2 < this.f112504OooOooO) {
                    ArrayList arrayList = this.f112497OooOo;
                    int i3 = i2 + 1;
                    this.f112502OooOoo = i3;
                    this.f112500OooOoO0 = (byte[]) arrayList.get(i3);
                    this.f112501OooOoOO = 0;
                }
                i = -1;
            }
            this.f112499OooOoO++;
            byte[] bArr = this.f112500OooOoO0;
            int i4 = this.f112501OooOoOO;
            this.f112501OooOoOO = i4 + 1;
            i = bArr[i4] & 255;
        } else {
            i = -1;
        }
        if (i != -1) {
            Ooooo00(1);
        }
        return i;
    }

    @Override // o0ooO0o.InterfaceC31461OooO0oO
    public final int read() throws IOException {
        OooO00o();
        if (this.f112499OooOoO >= this.f112503OooOoo0) {
            return -1;
        }
        if (this.f112501OooOoOO >= this.f112498OooOo0o) {
            int i = this.f112502OooOoo;
            if (i >= this.f112504OooOooO) {
                return -1;
            }
            ArrayList arrayList = this.f112497OooOo;
            int i2 = i + 1;
            this.f112502OooOoo = i2;
            this.f112500OooOoO0 = (byte[]) arrayList.get(i2);
            this.f112501OooOoOO = 0;
        }
        this.f112499OooOoO++;
        byte[] bArr = this.f112500OooOoO0;
        int i3 = this.f112501OooOoOO;
        this.f112501OooOoOO = i3 + 1;
        return bArr[i3] & 255;
    }

    @Override // o0ooO0o.InterfaceC31461OooO0oO
    public final void seek(long j) throws IOException {
        OooO00o();
        if (j < 0) {
            throw new IOException(androidx.concurrent.futures.OooO00o.OooO0O0(j, "Invalid position "));
        }
        this.f112499OooOoO = j;
        long j2 = this.f112503OooOoo0;
        int i = this.f112498OooOo0o;
        if (j >= j2) {
            int i2 = this.f112504OooOooO;
            this.f112502OooOoo = i2;
            this.f112500OooOoO0 = (byte[]) this.f112497OooOo.get(i2);
            this.f112501OooOoOO = (int) (this.f112503OooOoo0 % ((long) i));
            return;
        }
        long j3 = i;
        int i3 = (int) (j / j3);
        this.f112502OooOoo = i3;
        this.f112501OooOoOO = (int) (j % j3);
        this.f112500OooOoO0 = (byte[]) this.f112497OooOo.get(i3);
    }

    @Override // o0ooO0o.InterfaceC31461OooO0oO
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        OooO00o();
        if (this.f112499OooOoO >= this.f112503OooOoo0) {
            return -1;
        }
        int iOooO0OO = OooO0OO(i, i2, bArr);
        while (iOooO0OO < i2) {
            OooO00o();
            long j = this.f112503OooOoo0;
            OooO00o();
            if (((int) Math.min(j - this.f112499OooOoO, 2147483647L)) <= 0) {
                break;
            }
            iOooO0OO += OooO0OO(i + iOooO0OO, i2 - iOooO0OO, bArr);
            if (this.f112501OooOoOO == this.f112498OooOo0o) {
                int i3 = this.f112502OooOoo;
                if (i3 != this.f112504OooOooO) {
                    this.f112501OooOoOO = 0;
                    ArrayList arrayList = this.f112497OooOo;
                    int i4 = i3 + 1;
                    this.f112502OooOoo = i4;
                    this.f112500OooOoO0 = (byte[]) arrayList.get(i4);
                } else {
                    throw new IOException("No more chunks available, end of buffer reached");
                }
            }
        }
        return iOooO0OO;
    }

    @Override // o0ooO0o.InterfaceC31461OooO0oO
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }
}
