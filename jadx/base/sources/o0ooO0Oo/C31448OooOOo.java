package o0ooO0Oo;

import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import o0ooO0o.C31454OooO;
import o0ooO0o.C31455OooO00o;
import o0ooO0o.C31459OooO0o;
import o0ooO0o.C31460OooO0o0;
import o0ooO0o.C31462OooO0oo;
import o0ooO0o0.AbstractC31473OooOO0O;
import o0ooO0o0.C31474OooOO0o;
import o0ooOO0O.C31606OooO00o;
import o0ooOO0O.C31607OooO0O0;
import o0ooo000.AbstractC31745OooOO0O;

/* JADX INFO: renamed from: o0ooO0Oo.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31448OooOOo extends C31436OooO0Oo implements Closeable {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public C31454OooO f112475OooOoO;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final C31462OooO0oo f112476OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f112477OooOoo0;

    public C31448OooOOo() {
        this(C31462OooO0oo.OooOOO0());
    }

    @Override // o0ooO0Oo.C31436OooO0Oo, o0ooO0Oo.AbstractC31434OooO0O0
    public final Object OooOOoo(C31607OooO0O0 c31607OooO0O0) throws Throwable {
        Throwable th;
        if (c31607OooO0O0.f112995Oooo0o0) {
            AbstractC31745OooOO0O abstractC31745OooOO0OOooO0O0 = c31607OooO0O0.f112993Oooo0OO.OooOOO0().OooO0O0();
            C31444OooOOO c31444OooOOO = c31607OooO0O0.f112992Oooo0O0;
            long j = c31444OooOOO.f112466OooOo0o;
            int i = c31444OooOOO.f112465OooOo;
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(C31455OooO00o.OooO0Oo(oooo00o()));
            C31449OooOOo0 c31449OooOOo0O000o0O0 = o000o0O0();
            try {
                abstractC31745OooOO0OOooO0O0.OooO0Oo(j, i, byteArrayInputStream, c31449OooOOo0O000o0O0, false);
            } finally {
                c31449OooOOo0O000o0O0.close();
            }
        }
        C31460OooO0o0 c31460OooO0o0 = null;
        try {
            c31607OooO0O0.OooOooo(this);
            c31607OooO0O0.f112981OooOoO.write(C31607OooO0O0.f112976OooooO0);
            C31606OooO00o c31606OooO00o = c31607OooO0O0.f112981OooOoO;
            byte[] bArr = C31606OooO00o.f112958OooOoO0;
            c31606OooO00o.write(bArr);
            C31460OooO0o0 c31460OooO0o0Oooo00o = oooo00o();
            try {
                C31455OooO00o.OooO0OO(c31460OooO0o0Oooo00o, c31607OooO0O0.f112981OooOoO);
                c31607OooO0O0.f112981OooOoO.write(bArr);
                c31607OooO0O0.f112981OooOoO.write(C31607OooO0O0.f112977OooooOO);
                c31607OooO0O0.f112981OooOoO.OooO00o();
                c31460OooO0o0Oooo00o.close();
                return null;
            } catch (Throwable th2) {
                th = th2;
                c31460OooO0o0 = c31460OooO0o0Oooo00o;
                if (c31460OooO0o0 == null) {
                    throw th;
                }
                c31460OooO0o0.close();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        C31454OooO c31454OooO = this.f112475OooOoO;
        if (c31454OooO != null) {
            c31454OooO.close();
        }
    }

    public final void o000o00() throws IOException {
        C31454OooO c31454OooO = this.f112475OooOoO;
        if (c31454OooO != null && c31454OooO.f112483OooOo == null) {
            throw new IOException("COSStream has been closed and cannot be read. Perhaps its enclosing PDDocument has been closed?");
        }
    }

    public final C31440OooO0oo o000o00O() throws IOException {
        o000o00();
        if (this.f112477OooOoo0) {
            throw new IllegalStateException("Cannot read while there is an open stream writer");
        }
        C31454OooO c31454OooO = this.f112475OooOoO;
        C31462OooO0oo c31462OooO0oo = this.f112476OooOoOO;
        if (c31454OooO == null) {
            c31462OooO0oo.getClass();
            this.f112475OooOoO = new C31454OooO(c31462OooO0oo);
        }
        InputStream c31460OooO0o0 = new C31460OooO0o0(this.f112475OooOoO);
        ArrayList arrayListO000o0O = o000o0O();
        int i = C31440OooO0oo.f112237OooOo;
        if (arrayListO000o0O.isEmpty()) {
            return new C31440OooO0oo(c31460OooO0o0, Collections.EMPTY_LIST);
        }
        ArrayList arrayList = new ArrayList(arrayListO000o0O.size());
        if (arrayListO000o0O.size() > 1 && new HashSet(arrayListO000o0O).size() != arrayListO000o0O.size()) {
            throw new IOException("Duplicate");
        }
        for (int i2 = 0; i2 < arrayListO000o0O.size(); i2++) {
            if (c31462OooO0oo != null) {
                C31454OooO c31454OooO2 = new C31454OooO(c31462OooO0oo);
                arrayList.add(((AbstractC31473OooOO0O) arrayListO000o0O.get(i2)).OooO0O0(c31460OooO0o0, new C31459OooO0o(c31454OooO2), this, i2));
                c31460OooO0o0 = new C31439OooO0oO(c31454OooO2, c31454OooO2);
            } else {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                arrayList.add(((AbstractC31473OooOO0O) arrayListO000o0O.get(i2)).OooO0O0(c31460OooO0o0, byteArrayOutputStream, this, i2));
                c31460OooO0o0 = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            }
        }
        return new C31440OooO0oo(c31460OooO0o0, arrayList);
    }

    public final C31447OooOOOo o000o00o(AbstractC31434OooO0O0 abstractC31434OooO0O0) throws IOException {
        o000o00();
        if (this.f112477OooOoo0) {
            throw new IllegalStateException("Cannot have more than one open stream writer.");
        }
        if (abstractC31434OooO0O0 != null) {
            o000OoOO(C31441OooOO0.f112295o0000OOo, abstractC31434OooO0O0);
        }
        C31455OooO00o.OooO0O0(this.f112475OooOoO);
        C31462OooO0oo c31462OooO0oo = this.f112476OooOoOO;
        c31462OooO0oo.getClass();
        this.f112475OooOoO = new C31454OooO(c31462OooO0oo);
        C31446OooOOOO c31446OooOOOO = new C31446OooOOOO(o000o0O(), this, new C31459OooO0o(this.f112475OooOoO), c31462OooO0oo);
        this.f112477OooOoo0 = true;
        return new C31447OooOOOo(this, c31446OooOOOO);
    }

    public final ArrayList o000o0O() throws IOException {
        AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O = o0000O0O(C31441OooOO0.f112295o0000OOo);
        if (abstractC31434OooO0O0O0000O0O instanceof C31441OooOO0) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(C31474OooOO0o.f112596OooO0O0.OooO00o((C31441OooOO0) abstractC31434OooO0O0O0000O0O));
            return arrayList;
        }
        if (!(abstractC31434OooO0O0O0000O0O instanceof C31433OooO00o)) {
            return new ArrayList();
        }
        C31433OooO00o c31433OooO00o = (C31433OooO00o) abstractC31434OooO0O0O0000O0O;
        ArrayList arrayList2 = new ArrayList(c31433OooO00o.f112214OooOo.size());
        for (int i = 0; i < c31433OooO00o.f112214OooOo.size(); i++) {
            AbstractC31434OooO0O0 abstractC31434OooO0O0Oooo0 = c31433OooO00o.Oooo0(i);
            if (!(abstractC31434OooO0O0Oooo0 instanceof C31441OooOO0)) {
                throw new IOException("Forbidden type in filter array: ".concat(abstractC31434OooO0O0Oooo0 == null ? CloudMetaExtra.DEFINE_NON_PARENT_ID : abstractC31434OooO0O0Oooo0.getClass().getName()));
            }
            arrayList2.add(C31474OooOO0o.f112596OooO0O0.OooO00o((C31441OooOO0) abstractC31434OooO0O0Oooo0));
        }
        return arrayList2;
    }

    public final C31449OooOOo0 o000o0O0() throws IOException {
        o000o00();
        if (this.f112477OooOoo0) {
            throw new IllegalStateException("Cannot have more than one open stream writer.");
        }
        C31455OooO00o.OooO0O0(this.f112475OooOoO);
        C31462OooO0oo c31462OooO0oo = this.f112476OooOoOO;
        c31462OooO0oo.getClass();
        this.f112475OooOoO = new C31454OooO(c31462OooO0oo);
        C31459OooO0o c31459OooO0o = new C31459OooO0o(this.f112475OooOoO);
        this.f112477OooOoo0 = true;
        return new C31449OooOOo0(this, c31459OooO0o);
    }

    public final C31460OooO0o0 oooo00o() throws IOException {
        o000o00();
        if (this.f112477OooOoo0) {
            throw new IllegalStateException("Cannot read while there is an open stream writer");
        }
        if (this.f112475OooOoO == null) {
            C31462OooO0oo c31462OooO0oo = this.f112476OooOoOO;
            c31462OooO0oo.getClass();
            this.f112475OooOoO = new C31454OooO(c31462OooO0oo);
        }
        return new C31460OooO0o0(this.f112475OooOoO);
    }

    public C31448OooOOo(C31462OooO0oo c31462OooO0oo) {
        o000Oo(C31441OooOO0.f112340o000OooO, 0);
        this.f112476OooOoOO = c31462OooO0oo == null ? C31462OooO0oo.OooOOO0() : c31462OooO0oo;
    }
}
