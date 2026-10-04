package com.huawei.hms.network.embedded;

import OooOoo.C20593OooO0Oo;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.v8 */
/* JADX INFO: loaded from: classes9.dex */
public final class C18391v8 implements Closeable, Flushable {

    /* JADX INFO: renamed from: A */
    public static final Pattern f56428A = Pattern.compile("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: B */
    public static final String f56429B = "CLEAN";

    /* JADX INFO: renamed from: C */
    public static final String f56430C = "DIRTY";

    /* JADX INFO: renamed from: D */
    public static final String f56431D = "REMOVE";

    /* JADX INFO: renamed from: E */
    public static final String f56432E = "READ";

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ boolean f56433F = true;

    /* JADX INFO: renamed from: u */
    public static final String f56434u = "journal";

    /* JADX INFO: renamed from: v */
    public static final String f56435v = "journal.tmp";

    /* JADX INFO: renamed from: w */
    public static final String f56436w = "journal.bkp";

    /* JADX INFO: renamed from: x */
    public static final String f56437x = "libcore.io.DiskLruCache";

    /* JADX INFO: renamed from: y */
    public static final String f56438y = "1";

    /* JADX INFO: renamed from: z */
    public static final long f56439z = -1;

    /* JADX INFO: renamed from: a */
    public final InterfaceC18302oa f56440a;

    /* JADX INFO: renamed from: b */
    public final File f56441b;

    /* JADX INFO: renamed from: c */
    public final File f56442c;

    /* JADX INFO: renamed from: d */
    public final File f56443d;

    /* JADX INFO: renamed from: e */
    public final File f56444e;

    /* JADX INFO: renamed from: f */
    public final int f56445f;

    /* JADX INFO: renamed from: g */
    public long f56446g;

    /* JADX INFO: renamed from: h */
    public final int f56447h;

    /* JADX INFO: renamed from: j */
    public InterfaceC18275mb f56449j;

    /* JADX INFO: renamed from: l */
    public int f56451l;

    /* JADX INFO: renamed from: m */
    public boolean f56452m;

    /* JADX INFO: renamed from: n */
    public boolean f56453n;

    /* JADX INFO: renamed from: o */
    public boolean f56454o;

    /* JADX INFO: renamed from: p */
    public boolean f56455p;

    /* JADX INFO: renamed from: q */
    public boolean f56456q;

    /* JADX INFO: renamed from: s */
    public final Executor f56458s;

    /* JADX INFO: renamed from: i */
    public long f56448i = 0;

    /* JADX INFO: renamed from: k */
    public final LinkedHashMap<String, e> f56450k = new LinkedHashMap<>(0, 0.75f, true);

    /* JADX INFO: renamed from: r */
    public long f56457r = 0;

    /* JADX INFO: renamed from: t */
    public final Runnable f56459t = new a();

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.v8$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (C18391v8.this) {
                C18391v8 c18391v8 = C18391v8.this;
                if ((!c18391v8.f56453n) || c18391v8.f56454o) {
                    return;
                }
                try {
                    c18391v8.m79754C();
                } catch (IOException unused) {
                    C18391v8.this.f56455p = true;
                }
                try {
                    if (C18391v8.this.m79768y()) {
                        C18391v8.this.m79769z();
                        C18391v8.this.f56451l = 0;
                    }
                } catch (IOException unused2) {
                    C18391v8 c18391v82 = C18391v8.this;
                    c18391v82.f56456q = true;
                    c18391v82.f56449j = C18433yb.m80006a(C18433yb.m79998a());
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.v8$b */
    public class b extends C18404w8 {

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ boolean f56461d = true;

        public b(InterfaceC18220ic interfaceC18220ic) {
            super(interfaceC18220ic);
        }

        @Override // com.huawei.hms.network.embedded.C18404w8
        /* JADX INFO: renamed from: a */
        public void mo79770a(IOException iOException) {
            if (!f56461d && !Thread.holdsLock(C18391v8.this)) {
                throw new AssertionError();
            }
            C18391v8.this.f56452m = true;
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.v8$c */
    public class c implements Iterator<f> {

        /* JADX INFO: renamed from: a */
        public final Iterator<e> f56463a;

        /* JADX INFO: renamed from: b */
        public f f56464b;

        /* JADX INFO: renamed from: c */
        public f f56465c;

        public c() {
            this.f56463a = new ArrayList(C18391v8.this.f56450k.values()).iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            f fVarM79778a;
            if (this.f56464b != null) {
                return true;
            }
            synchronized (C18391v8.this) {
                try {
                    if (C18391v8.this.f56454o) {
                        return false;
                    }
                    while (this.f56463a.hasNext()) {
                        e next = this.f56463a.next();
                        if (next.f56476e && (fVarM79778a = next.m79778a()) != null) {
                            this.f56464b = fVarM79778a;
                            return true;
                        }
                    }
                    return false;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public f next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            f fVar = this.f56464b;
            this.f56465c = fVar;
            this.f56464b = null;
            return fVar;
        }

        @Override // java.util.Iterator
        public void remove() {
            f fVar = this.f56465c;
            if (fVar == null) {
                throw new IllegalStateException("remove() before next()");
            }
            try {
                C18391v8.this.m79760d(fVar.f56480a);
            } catch (IOException unused) {
            } finally {
                this.f56465c = null;
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.v8$d */
    public final class d {

        /* JADX INFO: renamed from: a */
        public final e f56467a;

        /* JADX INFO: renamed from: b */
        public final boolean[] f56468b;

        /* JADX INFO: renamed from: c */
        public boolean f56469c;

        /* JADX INFO: renamed from: com.huawei.hms.network.embedded.v8$d$a */
        public class a extends C18404w8 {
            public a(InterfaceC18220ic interfaceC18220ic) {
                super(interfaceC18220ic);
            }

            @Override // com.huawei.hms.network.embedded.C18404w8
            /* JADX INFO: renamed from: a */
            public void mo79770a(IOException iOException) {
                synchronized (C18391v8.this) {
                    d.this.m79776d();
                }
            }
        }

        public d(e eVar) {
            this.f56467a = eVar;
            this.f56468b = eVar.f56476e ? null : new boolean[C18391v8.this.f56447h];
        }

        /* JADX INFO: renamed from: a */
        public InterfaceC18220ic m79771a(int i) {
            synchronized (C18391v8.this) {
                try {
                    if (this.f56469c) {
                        throw new IllegalStateException();
                    }
                    e eVar = this.f56467a;
                    if (eVar.f56477f != this) {
                        return C18433yb.m79998a();
                    }
                    if (!eVar.f56476e) {
                        this.f56468b[i] = true;
                    }
                    try {
                        return new a(C18391v8.this.f56440a.mo79284e(eVar.f56475d[i]));
                    } catch (FileNotFoundException unused) {
                        return C18433yb.m79998a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public InterfaceC18234jc m79773b(int i) {
            synchronized (C18391v8.this) {
                try {
                    if (this.f56469c) {
                        throw new IllegalStateException();
                    }
                    e eVar = this.f56467a;
                    if (!eVar.f56476e || eVar.f56477f != this) {
                        return null;
                    }
                    try {
                        return C18391v8.this.f56440a.mo79282c(eVar.f56474c[i]);
                    } catch (FileNotFoundException unused) {
                        return null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public void m79775c() throws IOException {
            synchronized (C18391v8.this) {
                try {
                    if (this.f56469c) {
                        throw new IllegalStateException();
                    }
                    if (this.f56467a.f56477f == this) {
                        C18391v8.this.m79756a(this, true);
                    }
                    this.f56469c = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public void m79776d() {
            if (this.f56467a.f56477f != this) {
                return;
            }
            int i = 0;
            while (true) {
                C18391v8 c18391v8 = C18391v8.this;
                if (i >= c18391v8.f56447h) {
                    this.f56467a.f56477f = null;
                    return;
                } else {
                    try {
                        c18391v8.f56440a.mo79281b(this.f56467a.f56475d[i]);
                    } catch (IOException unused) {
                    }
                    i++;
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public void m79772a() throws IOException {
            synchronized (C18391v8.this) {
                try {
                    if (this.f56469c) {
                        throw new IllegalStateException();
                    }
                    if (this.f56467a.f56477f == this) {
                        C18391v8.this.m79756a(this, false);
                    }
                    this.f56469c = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public void m79774b() {
            synchronized (C18391v8.this) {
                if (!this.f56469c && this.f56467a.f56477f == this) {
                    try {
                        C18391v8.this.m79756a(this, false);
                    } catch (IOException unused) {
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.v8$e */
    public final class e {

        /* JADX INFO: renamed from: a */
        public final String f56472a;

        /* JADX INFO: renamed from: b */
        public final long[] f56473b;

        /* JADX INFO: renamed from: c */
        public final File[] f56474c;

        /* JADX INFO: renamed from: d */
        public final File[] f56475d;

        /* JADX INFO: renamed from: e */
        public boolean f56476e;

        /* JADX INFO: renamed from: f */
        public d f56477f;

        /* JADX INFO: renamed from: g */
        public long f56478g;

        public e(String str) {
            this.f56472a = str;
            int i = C18391v8.this.f56447h;
            this.f56473b = new long[i];
            this.f56474c = new File[i];
            this.f56475d = new File[i];
            StringBuilder sb = new StringBuilder(str);
            sb.append(FilenameUtils.EXTENSION_SEPARATOR);
            int length = sb.length();
            for (int i2 = 0; i2 < C18391v8.this.f56447h; i2++) {
                sb.append(i2);
                this.f56474c[i2] = new File(C18391v8.this.f56441b, sb.toString());
                sb.append(".tmp");
                this.f56475d[i2] = new File(C18391v8.this.f56441b, sb.toString());
                sb.setLength(length);
            }
        }

        /* JADX INFO: renamed from: b */
        private IOException m79777b(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* JADX INFO: renamed from: a */
        public f m79778a() {
            InterfaceC18234jc interfaceC18234jc;
            if (!Thread.holdsLock(C18391v8.this)) {
                throw new AssertionError();
            }
            InterfaceC18234jc[] interfaceC18234jcArr = new InterfaceC18234jc[C18391v8.this.f56447h];
            long[] jArr = (long[]) this.f56473b.clone();
            int i = 0;
            int i2 = 0;
            while (true) {
                try {
                    C18391v8 c18391v8 = C18391v8.this;
                    if (i2 >= c18391v8.f56447h) {
                        return c18391v8.new f(this.f56472a, this.f56478g, interfaceC18234jcArr, jArr);
                    }
                    interfaceC18234jcArr[i2] = c18391v8.f56440a.mo79282c(this.f56474c[i2]);
                    i2++;
                } catch (FileNotFoundException unused) {
                    while (true) {
                        C18391v8 c18391v82 = C18391v8.this;
                        if (i >= c18391v82.f56447h || (interfaceC18234jc = interfaceC18234jcArr[i]) == null) {
                            try {
                                c18391v82.m79757a(this);
                                return null;
                            } catch (IOException unused2) {
                                return null;
                            }
                        }
                        C18313p8.m79378a(interfaceC18234jc);
                        i++;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public void m79779a(InterfaceC18275mb interfaceC18275mb) throws IOException {
            for (long j : this.f56473b) {
                interfaceC18275mb.writeByte(32).mo78266b(j);
            }
        }

        /* JADX INFO: renamed from: a */
        public void m79780a(String[] strArr) throws IOException {
            if (strArr.length != C18391v8.this.f56447h) {
                throw m79777b(strArr);
            }
            for (int i = 0; i < strArr.length; i++) {
                try {
                    this.f56473b[i] = Long.parseLong(strArr[i]);
                } catch (NumberFormatException unused) {
                    throw m79777b(strArr);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.v8$f */
    public final class f implements Closeable {

        /* JADX INFO: renamed from: a */
        public final String f56480a;

        /* JADX INFO: renamed from: b */
        public final long f56481b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC18234jc[] f56482c;

        /* JADX INFO: renamed from: d */
        public final long[] f56483d;

        public f(String str, long j, InterfaceC18234jc[] interfaceC18234jcArr, long[] jArr) {
            this.f56480a = str;
            this.f56481b = j;
            this.f56482c = interfaceC18234jcArr;
            this.f56483d = jArr;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (InterfaceC18234jc interfaceC18234jc : this.f56482c) {
                C18313p8.m79378a(interfaceC18234jc);
            }
        }

        /* JADX INFO: renamed from: d */
        public long m79782d(int i) {
            return this.f56483d[i];
        }

        /* JADX INFO: renamed from: e */
        public InterfaceC18234jc m79783e(int i) {
            return this.f56482c[i];
        }

        /* JADX INFO: renamed from: s */
        public d m79784s() throws IOException {
            return C18391v8.this.m79755a(this.f56480a, this.f56481b);
        }

        /* JADX INFO: renamed from: t */
        public String m79785t() {
            return this.f56480a;
        }
    }

    public C18391v8(InterfaceC18302oa interfaceC18302oa, File file, int i, int i2, long j, Executor executor) {
        this.f56440a = interfaceC18302oa;
        this.f56441b = file;
        this.f56445f = i;
        this.f56442c = new File(file, "journal");
        this.f56443d = new File(file, "journal.tmp");
        this.f56444e = new File(file, "journal.bkp");
        this.f56447h = i2;
        this.f56446g = j;
        this.f56458s = executor;
    }

    /* JADX INFO: renamed from: D */
    private synchronized void m79744D() {
        if (m79767x()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX INFO: renamed from: E */
    private InterfaceC18275mb m79745E() throws FileNotFoundException {
        return C18433yb.m80006a(new b(this.f56440a.mo79286g(this.f56442c)));
    }

    /* JADX INFO: renamed from: F */
    private void m79746F() throws IOException {
        this.f56440a.mo79281b(this.f56443d);
        Iterator<e> it = this.f56450k.values().iterator();
        while (it.hasNext()) {
            e next = it.next();
            int i = 0;
            if (next.f56477f == null) {
                while (i < this.f56447h) {
                    this.f56448i += next.f56473b[i];
                    i++;
                }
            } else {
                next.f56477f = null;
                while (i < this.f56447h) {
                    this.f56440a.mo79281b(next.f56474c[i]);
                    this.f56440a.mo79281b(next.f56475d[i]);
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: G */
    private void m79747G() throws Exception {
        InterfaceC18289nb interfaceC18289nbM80007a = C18433yb.m80007a(this.f56440a.mo79282c(this.f56442c));
        try {
            String strMo78397m = interfaceC18289nbM80007a.mo78397m();
            String strMo78397m2 = interfaceC18289nbM80007a.mo78397m();
            String strMo78397m3 = interfaceC18289nbM80007a.mo78397m();
            String strMo78397m4 = interfaceC18289nbM80007a.mo78397m();
            String strMo78397m5 = interfaceC18289nbM80007a.mo78397m();
            if (!"libcore.io.DiskLruCache".equals(strMo78397m) || !"1".equals(strMo78397m2) || !Integer.toString(this.f56445f).equals(strMo78397m3) || !Integer.toString(this.f56447h).equals(strMo78397m4) || !"".equals(strMo78397m5)) {
                throw new IOException("unexpected journal header: [" + strMo78397m + ", " + strMo78397m2 + ", " + strMo78397m4 + ", " + strMo78397m5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    m79750e(interfaceC18289nbM80007a.mo78397m());
                    i++;
                } catch (EOFException unused) {
                    this.f56451l = i - this.f56450k.size();
                    if (interfaceC18289nbM80007a.mo78389f()) {
                        this.f56449j = m79745E();
                    } else {
                        m79769z();
                    }
                    m79749a((Throwable) null, interfaceC18289nbM80007a);
                    return;
                }
            }
        } finally {
        }
    }

    /* JADX INFO: renamed from: e */
    private void m79750e(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                this.f56450k.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        e eVar = this.f56450k.get(strSubstring);
        if (eVar == null) {
            eVar = new e(strSubstring);
            this.f56450k.put(strSubstring, eVar);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            eVar.f56476e = true;
            eVar.f56477f = null;
            eVar.m79780a(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
            eVar.f56477f = new d(eVar);
        } else if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
    }

    /* JADX INFO: renamed from: f */
    private void m79751f(String str) {
        if (!f56428A.matcher(str).matches()) {
            throw new IllegalArgumentException(C20593OooO0Oo.OooO0O0("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
        }
    }

    /* JADX INFO: renamed from: A */
    public synchronized long m79752A() throws IOException {
        m79766w();
        return this.f56448i;
    }

    /* JADX INFO: renamed from: B */
    public synchronized Iterator<f> m79753B() throws IOException {
        m79766w();
        return new c();
    }

    /* JADX INFO: renamed from: C */
    public void m79754C() throws IOException {
        while (this.f56448i > this.f56446g) {
            m79757a(this.f56450k.values().iterator().next());
        }
        this.f56455p = false;
    }

    /* JADX INFO: renamed from: a */
    public synchronized d m79755a(String str, long j) throws IOException {
        m79766w();
        m79744D();
        m79751f(str);
        e eVar = this.f56450k.get(str);
        if (j != -1 && (eVar == null || eVar.f56478g != j)) {
            return null;
        }
        if (eVar != null && eVar.f56477f != null) {
            return null;
        }
        if (!this.f56455p && !this.f56456q) {
            this.f56449j.mo78261a("DIRTY").writeByte(32).mo78261a(str).writeByte(10);
            this.f56449j.flush();
            if (this.f56452m) {
                return null;
            }
            if (eVar == null) {
                eVar = new e(str);
                this.f56450k.put(str, eVar);
            }
            d dVar = new d(eVar);
            eVar.f56477f = dVar;
            return dVar;
        }
        this.f56458s.execute(this.f56459t);
        return null;
    }

    /* JADX INFO: renamed from: b */
    public d m79758b(String str) throws IOException {
        return m79755a(str, -1L);
    }

    /* JADX INFO: renamed from: c */
    public synchronized f m79759c(String str) throws IOException {
        m79766w();
        m79744D();
        m79751f(str);
        e eVar = this.f56450k.get(str);
        if (eVar != null && eVar.f56476e) {
            f fVarM79778a = eVar.m79778a();
            if (fVarM79778a == null) {
                return null;
            }
            this.f56451l++;
            this.f56449j.mo78261a("READ").writeByte(32).mo78261a(str).writeByte(10);
            if (m79768y()) {
                this.f56458s.execute(this.f56459t);
            }
            return fVarM79778a;
        }
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        try {
            if (this.f56453n && !this.f56454o) {
                for (e eVar : (e[]) this.f56450k.values().toArray(new e[this.f56450k.size()])) {
                    d dVar = eVar.f56477f;
                    if (dVar != null) {
                        dVar.m79772a();
                    }
                }
                m79754C();
                this.f56449j.close();
                this.f56449j = null;
                this.f56454o = true;
                return;
            }
            this.f56454o = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public synchronized boolean m79760d(String str) throws IOException {
        m79766w();
        m79744D();
        m79751f(str);
        e eVar = this.f56450k.get(str);
        if (eVar == null) {
            return false;
        }
        boolean zM79757a = m79757a(eVar);
        if (zM79757a && this.f56448i <= this.f56446g) {
            this.f56455p = false;
        }
        return zM79757a;
    }

    @Override // java.io.Flushable
    public synchronized void flush() throws IOException {
        if (this.f56453n) {
            m79744D();
            m79754C();
            this.f56449j.flush();
        }
    }

    /* JADX INFO: renamed from: j */
    public synchronized void m79761j(long j) {
        this.f56446g = j;
        if (this.f56453n) {
            this.f56458s.execute(this.f56459t);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m79762s() throws IOException {
        close();
        this.f56440a.mo79285f(this.f56441b);
    }

    /* JADX INFO: renamed from: t */
    public synchronized void m79763t() throws IOException {
        try {
            m79766w();
            for (e eVar : (e[]) this.f56450k.values().toArray(new e[this.f56450k.size()])) {
                m79757a(eVar);
            }
            this.f56455p = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: u */
    public File m79764u() {
        return this.f56441b;
    }

    /* JADX INFO: renamed from: v */
    public synchronized long m79765v() {
        return this.f56446g;
    }

    /* JADX INFO: renamed from: w */
    public synchronized void m79766w() throws IOException {
        try {
            if (!f56433F && !Thread.holdsLock(this)) {
                throw new AssertionError();
            }
            if (this.f56453n) {
                return;
            }
            if (this.f56440a.mo79280a(this.f56444e)) {
                if (this.f56440a.mo79280a(this.f56442c)) {
                    this.f56440a.mo79281b(this.f56444e);
                } else {
                    this.f56440a.mo79279a(this.f56444e, this.f56442c);
                }
            }
            if (this.f56440a.mo79280a(this.f56442c)) {
                try {
                    m79747G();
                    m79746F();
                    this.f56453n = true;
                    return;
                } catch (IOException e2) {
                    C18406wa.m79845f().mo79425a(5, "DiskLruCache " + this.f56441b + " is corrupt: " + e2.getMessage() + ", removing", e2);
                    try {
                        m79762s();
                        this.f56454o = false;
                        m79769z();
                        this.f56453n = true;
                    } catch (Throwable th) {
                        this.f56454o = false;
                        throw th;
                    }
                }
            }
            m79769z();
            this.f56453n = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: x */
    public synchronized boolean m79767x() {
        return this.f56454o;
    }

    /* JADX INFO: renamed from: y */
    public boolean m79768y() {
        int i = this.f56451l;
        return i >= 2000 && i >= this.f56450k.size();
    }

    /* JADX INFO: renamed from: z */
    public synchronized void m79769z() throws IOException {
        try {
            InterfaceC18275mb interfaceC18275mb = this.f56449j;
            if (interfaceC18275mb != null) {
                interfaceC18275mb.close();
            }
            InterfaceC18275mb interfaceC18275mbM80006a = C18433yb.m80006a(this.f56440a.mo79284e(this.f56443d));
            try {
                interfaceC18275mbM80006a.mo78261a("libcore.io.DiskLruCache").writeByte(10);
                interfaceC18275mbM80006a.mo78261a("1").writeByte(10);
                interfaceC18275mbM80006a.mo78266b(this.f56445f).writeByte(10);
                interfaceC18275mbM80006a.mo78266b(this.f56447h).writeByte(10);
                interfaceC18275mbM80006a.writeByte(10);
                for (e eVar : this.f56450k.values()) {
                    if (eVar.f56477f != null) {
                        interfaceC18275mbM80006a.mo78261a("DIRTY").writeByte(32);
                        interfaceC18275mbM80006a.mo78261a(eVar.f56472a);
                    } else {
                        interfaceC18275mbM80006a.mo78261a("CLEAN").writeByte(32);
                        interfaceC18275mbM80006a.mo78261a(eVar.f56472a);
                        eVar.m79779a(interfaceC18275mbM80006a);
                    }
                    interfaceC18275mbM80006a.writeByte(10);
                }
                m79749a((Throwable) null, interfaceC18275mbM80006a);
                if (this.f56440a.mo79280a(this.f56442c)) {
                    this.f56440a.mo79279a(this.f56442c, this.f56444e);
                }
                this.f56440a.mo79279a(this.f56443d, this.f56442c);
                this.f56440a.mo79281b(this.f56444e);
                this.f56449j = m79745E();
                this.f56452m = false;
                this.f56456q = false;
            } finally {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C18391v8 m79748a(InterfaceC18302oa interfaceC18302oa, File file, int i, int i2, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i2 > 0) {
            return new C18391v8(interfaceC18302oa, file, i, i2, j, new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), C18313p8.m79375a("OkHttp DiskLruCache", true)));
        }
        throw new IllegalArgumentException("valueCount <= 0");
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m79756a(d dVar, boolean z) throws IOException {
        e eVar = dVar.f56467a;
        if (eVar.f56477f != dVar) {
            throw new IllegalStateException();
        }
        if (z && !eVar.f56476e) {
            for (int i = 0; i < this.f56447h; i++) {
                if (!dVar.f56468b[i]) {
                    dVar.m79772a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                }
                if (!this.f56440a.mo79280a(eVar.f56475d[i])) {
                    dVar.m79772a();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < this.f56447h; i2++) {
            File file = eVar.f56475d[i2];
            if (!z) {
                this.f56440a.mo79281b(file);
            } else if (this.f56440a.mo79280a(file)) {
                File file2 = eVar.f56474c[i2];
                this.f56440a.mo79279a(file, file2);
                long j = eVar.f56473b[i2];
                long jMo79283d = this.f56440a.mo79283d(file2);
                eVar.f56473b[i2] = jMo79283d;
                this.f56448i = (this.f56448i - j) + jMo79283d;
            }
        }
        this.f56451l++;
        eVar.f56477f = null;
        if (eVar.f56476e || z) {
            eVar.f56476e = true;
            this.f56449j.mo78261a("CLEAN").writeByte(32);
            this.f56449j.mo78261a(eVar.f56472a);
            eVar.m79779a(this.f56449j);
            this.f56449j.writeByte(10);
            if (z) {
                long j2 = this.f56457r;
                this.f56457r = 1 + j2;
                eVar.f56478g = j2;
            }
        } else {
            this.f56450k.remove(eVar.f56472a);
            this.f56449j.mo78261a("REMOVE").writeByte(32);
            this.f56449j.mo78261a(eVar.f56472a);
            this.f56449j.writeByte(10);
        }
        this.f56449j.flush();
        if (this.f56448i > this.f56446g || m79768y()) {
            this.f56458s.execute(this.f56459t);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m79749a(Throwable th, AutoCloseable autoCloseable) throws Exception {
        if (th == null) {
            autoCloseable.close();
            return;
        }
        try {
            autoCloseable.close();
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m79757a(e eVar) throws IOException {
        d dVar = eVar.f56477f;
        if (dVar != null) {
            dVar.m79776d();
        }
        for (int i = 0; i < this.f56447h; i++) {
            this.f56440a.mo79281b(eVar.f56474c[i]);
            long j = this.f56448i;
            long[] jArr = eVar.f56473b;
            this.f56448i = j - jArr[i];
            jArr[i] = 0;
        }
        this.f56451l++;
        this.f56449j.mo78261a("REMOVE").writeByte(32).mo78261a(eVar.f56472a).writeByte(10);
        this.f56450k.remove(eVar.f56472a);
        if (m79768y()) {
            this.f56458s.execute(this.f56459t);
        }
        return true;
    }
}
