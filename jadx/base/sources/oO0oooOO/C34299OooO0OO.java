package oO0oooOO;

import androidx.datastore.preferences.protobuf.o000oOoO;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: oO0oooOO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34299OooO0OO extends AbstractC34303OooO0oO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f123138OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final List<C34304OooO0oo> f123139OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final boolean f123140OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final List<C34305OooOO0> f123141OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final long f123142OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final long f123143OooOoo0;

    public C34299OooO0OO(int i, ArrayList arrayList, ArrayList arrayList2, long j, long j2, boolean z) {
        super(2);
        this.f123142OooOoo = 0L;
        this.f123138OooOo = i;
        this.f123139OooOoO = Collections.unmodifiableList(arrayList);
        this.f123141OooOoOO = Collections.unmodifiableList(arrayList2);
        this.f123142OooOoo = j;
        this.f123143OooOoo0 = j2;
        this.f123140OooOoO0 = z;
    }

    public static C34299OooO0OO OooO0Oo(Object obj) throws Throwable {
        Throwable th;
        if (obj instanceof C34299OooO0OO) {
            return (C34299OooO0OO) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            if (dataInputStream.readInt() != 0) {
                throw new IllegalStateException("unknown version for hss private key");
            }
            int i = dataInputStream.readInt();
            long j = dataInputStream.readLong();
            long j2 = dataInputStream.readLong();
            boolean z = dataInputStream.readBoolean();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(C34304OooO0oo.OooO0o(obj));
            }
            for (int i3 = 0; i3 < i - 1; i3++) {
                arrayList2.add(C34305OooOO0.OooO00o(obj));
            }
            return new C34299OooO0OO(i, arrayList, arrayList2, j, j2, z);
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return OooO0Oo(oOO00.OooO00o.OooO00o((InputStream) obj));
            }
            throw new IllegalArgumentException(o000oOoO.OooO00o(obj, "cannot parse "));
        }
        DataInputStream dataInputStream2 = null;
        try {
            DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                C34299OooO0OO c34299OooO0OOOooO0Oo = OooO0Oo(dataInputStream3);
                dataInputStream3.close();
                return c34299OooO0OOOooO0Oo;
            } catch (Throwable th2) {
                th = th2;
                dataInputStream2 = dataInputStream3;
                if (dataInputStream2 == null) {
                    throw th;
                }
                dataInputStream2.close();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final Object clone() throws CloneNotSupportedException {
        try {
            return OooO0Oo(getEncoded());
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C34299OooO0OO.class != obj.getClass()) {
            return false;
        }
        C34299OooO0OO c34299OooO0OO = (C34299OooO0OO) obj;
        if (this.f123138OooOo == c34299OooO0OO.f123138OooOo && this.f123140OooOoO0 == c34299OooO0OO.f123140OooOoO0 && this.f123143OooOoo0 == c34299OooO0OO.f123143OooOoo0 && this.f123142OooOoo == c34299OooO0OO.f123142OooOoo && this.f123139OooOoO.equals(c34299OooO0OO.f123139OooOoO)) {
            return this.f123141OooOoOO.equals(c34299OooO0OO.f123141OooOoOO);
        }
        return false;
    }

    @Override // oOO000oO.InterfaceC34334OooO0OO
    public final synchronized byte[] getEncoded() throws IOException {
        C34297OooO00o c34297OooO00o;
        try {
            c34297OooO00o = new C34297OooO00o();
            c34297OooO00o.OooO0OO(0);
            c34297OooO00o.OooO0OO(this.f123138OooOo);
            long j = this.f123142OooOoo;
            c34297OooO00o.OooO0OO((int) (j >>> 32));
            c34297OooO00o.OooO0OO((int) j);
            long j2 = this.f123143OooOoo0;
            c34297OooO00o.OooO0OO((int) (j2 >>> 32));
            c34297OooO00o.OooO0OO((int) j2);
            c34297OooO00o.f123137OooO00o.write(this.f123140OooOoO0 ? 1 : 0);
            Iterator<C34304OooO0oo> it = this.f123139OooOoO.iterator();
            while (it.hasNext()) {
                c34297OooO00o.OooO00o(it.next());
            }
            Iterator<C34305OooOO0> it2 = this.f123141OooOoOO.iterator();
            while (it2.hasNext()) {
                c34297OooO00o.OooO00o(it2.next());
            }
        } catch (Throwable th) {
            throw th;
        }
        return c34297OooO00o.f123137OooO00o.toByteArray();
    }

    public final int hashCode() {
        int iHashCode = (this.f123141OooOoOO.hashCode() + ((this.f123139OooOoO.hashCode() + (((this.f123138OooOo * 31) + (this.f123140OooOoO0 ? 1 : 0)) * 31)) * 31)) * 31;
        long j = this.f123143OooOoo0;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f123142OooOoo;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }
}
