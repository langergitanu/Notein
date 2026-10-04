package com.huawei.hms.network.embedded;

import android.os.StrictMode;
import com.aspose.words.ControlChar;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.a */
/* JADX INFO: loaded from: classes9.dex */
public final class C18095a implements Closeable {

    /* JADX INFO: renamed from: o */
    public static final String f54085o = "journal";

    /* JADX INFO: renamed from: p */
    public static final String f54086p = "journal.tmp";

    /* JADX INFO: renamed from: q */
    public static final String f54087q = "journal.bkp";

    /* JADX INFO: renamed from: r */
    public static final String f54088r = "libcore.io.DiskLruCache";

    /* JADX INFO: renamed from: s */
    public static final String f54089s = "1";

    /* JADX INFO: renamed from: t */
    public static final long f54090t = -1;

    /* JADX INFO: renamed from: u */
    public static final String f54091u = "CLEAN";

    /* JADX INFO: renamed from: v */
    public static final String f54092v = "DIRTY";

    /* JADX INFO: renamed from: w */
    public static final String f54093w = "REMOVE";

    /* JADX INFO: renamed from: x */
    public static final String f54094x = "READ";

    /* JADX INFO: renamed from: a */
    public final File f54095a;

    /* JADX INFO: renamed from: b */
    public final File f54096b;

    /* JADX INFO: renamed from: c */
    public final File f54097c;

    /* JADX INFO: renamed from: d */
    public final File f54098d;

    /* JADX INFO: renamed from: e */
    public final int f54099e;

    /* JADX INFO: renamed from: f */
    public long f54100f;

    /* JADX INFO: renamed from: g */
    public final int f54101g;

    /* JADX INFO: renamed from: i */
    public Writer f54103i;

    /* JADX INFO: renamed from: k */
    public int f54105k;

    /* JADX INFO: renamed from: h */
    public long f54102h = 0;

    /* JADX INFO: renamed from: j */
    public final LinkedHashMap<String, d> f54104j = new LinkedHashMap<>(0, 0.75f, true);

    /* JADX INFO: renamed from: l */
    public long f54106l = 0;

    /* JADX INFO: renamed from: m */
    public final ThreadPoolExecutor f54107m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b(null));

    /* JADX INFO: renamed from: n */
    public final Callable<Void> f54108n = new a();

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.a$a */
    public class a implements Callable<Void> {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        public Void call() throws Exception {
            synchronized (C18095a.this) {
                try {
                    if (C18095a.this.f54103i == null) {
                        return null;
                    }
                    C18095a.this.m77773C();
                    if (C18095a.this.m77794y()) {
                        C18095a.this.m77772B();
                        C18095a.this.f54105k = 0;
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.a$b */
    public static final class b implements ThreadFactory {
        public b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.a$c */
    public final class c {

        /* JADX INFO: renamed from: a */
        public final d f54110a;

        /* JADX INFO: renamed from: b */
        public final boolean[] f54111b;

        /* JADX INFO: renamed from: c */
        public boolean f54112c;

        public c(d dVar) {
            this.f54110a = dVar;
            this.f54111b = dVar.f54118e ? null : new boolean[C18095a.this.f54101g];
        }

        /* JADX INFO: renamed from: c */
        private InputStream m77807c(int i) throws IOException {
            synchronized (C18095a.this) {
                if (this.f54110a.f54119f != this) {
                    throw new IllegalStateException();
                }
                if (!this.f54110a.f54118e) {
                    return null;
                }
                try {
                    return new FileInputStream(this.f54110a.m77825a(i));
                } catch (FileNotFoundException unused) {
                    return null;
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public String m77811b(int i) throws IOException {
            InputStream inputStreamM77807c = m77807c(i);
            if (inputStreamM77807c != null) {
                return C18095a.m77786b(inputStreamM77807c);
            }
            return null;
        }

        public /* synthetic */ c(C18095a c18095a, d dVar, a aVar) {
            this(dVar);
        }

        /* JADX INFO: renamed from: a */
        public File m77808a(int i) throws IOException {
            File fileM77827b;
            synchronized (C18095a.this) {
                try {
                    if (this.f54110a.f54119f != this) {
                        throw new IllegalStateException();
                    }
                    if (!this.f54110a.f54118e) {
                        this.f54111b[i] = true;
                    }
                    fileM77827b = this.f54110a.m77827b(i);
                    if (!C18095a.this.f54095a.exists()) {
                        C18095a.this.f54095a.mkdirs();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return fileM77827b;
        }

        /* JADX INFO: renamed from: b */
        public void m77812b() {
            if (this.f54112c) {
                return;
            }
            try {
                m77809a();
            } catch (IOException unused) {
            }
        }

        /* JADX INFO: renamed from: c */
        public void m77813c() throws IOException {
            C18095a.this.m77780a(this, true);
            this.f54112c = true;
        }

        /* JADX INFO: renamed from: a */
        public void m77809a() throws IOException {
            C18095a.this.m77780a(this, false);
        }

        /* JADX INFO: renamed from: a */
        public void m77810a(int i, String str) throws Throwable {
            Throwable th;
            OutputStreamWriter outputStreamWriter;
            try {
                outputStreamWriter = new OutputStreamWriter(new FileOutputStream(m77808a(i)), C18123c.f54349b);
                try {
                    outputStreamWriter.write(str);
                    C18123c.m78031a(outputStreamWriter);
                } catch (Throwable th2) {
                    th = th2;
                    C18123c.m78031a(outputStreamWriter);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                outputStreamWriter = null;
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.a$d */
    public final class d {

        /* JADX INFO: renamed from: a */
        public final String f54114a;

        /* JADX INFO: renamed from: b */
        public final long[] f54115b;

        /* JADX INFO: renamed from: c */
        public File[] f54116c;

        /* JADX INFO: renamed from: d */
        public File[] f54117d;

        /* JADX INFO: renamed from: e */
        public boolean f54118e;

        /* JADX INFO: renamed from: f */
        public c f54119f;

        /* JADX INFO: renamed from: g */
        public long f54120g;

        public d(String str) {
            this.f54114a = str;
            this.f54115b = new long[C18095a.this.f54101g];
            this.f54116c = new File[C18095a.this.f54101g];
            this.f54117d = new File[C18095a.this.f54101g];
            StringBuilder sb = new StringBuilder(str);
            sb.append(FilenameUtils.EXTENSION_SEPARATOR);
            int length = sb.length();
            for (int i = 0; i < C18095a.this.f54101g; i++) {
                sb.append(i);
                this.f54116c[i] = new File(C18095a.this.f54095a, sb.toString());
                sb.append(".tmp");
                this.f54117d[i] = new File(C18095a.this.f54095a, sb.toString());
                sb.setLength(length);
            }
        }

        /* JADX INFO: renamed from: b */
        public File m77827b(int i) {
            return this.f54117d[i];
        }

        public /* synthetic */ d(C18095a c18095a, String str, a aVar) {
            this(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public void m77821b(String[] strArr) throws IOException {
            if (strArr.length != C18095a.this.f54101g) {
                throw m77816a(strArr);
            }
            for (int i = 0; i < strArr.length; i++) {
                try {
                    this.f54115b[i] = Long.parseLong(strArr[i]);
                } catch (NumberFormatException unused) {
                    throw m77816a(strArr);
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public File m77825a(int i) {
            return this.f54116c[i];
        }

        /* JADX INFO: renamed from: a */
        private IOException m77816a(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* JADX INFO: renamed from: a */
        public String m77826a() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long j : this.f54115b) {
                sb.append(ControlChar.SPACE_CHAR);
                sb.append(j);
            }
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.a$e */
    public final class e {

        /* JADX INFO: renamed from: a */
        public final String f54122a;

        /* JADX INFO: renamed from: b */
        public final long f54123b;

        /* JADX INFO: renamed from: c */
        public final long[] f54124c;

        /* JADX INFO: renamed from: d */
        public final File[] f54125d;

        public e(String str, long j, File[] fileArr, long[] jArr) {
            this.f54122a = str;
            this.f54123b = j;
            this.f54125d = fileArr;
            this.f54124c = jArr;
        }

        /* JADX INFO: renamed from: a */
        public c m77828a() throws IOException {
            return C18095a.this.m77776a(this.f54122a, this.f54123b);
        }

        /* JADX INFO: renamed from: b */
        public long m77830b(int i) {
            return this.f54124c[i];
        }

        /* JADX INFO: renamed from: c */
        public String m77831c(int i) throws IOException {
            return C18095a.m77786b(new FileInputStream(this.f54125d[i]));
        }

        public /* synthetic */ e(C18095a c18095a, String str, long j, File[] fileArr, long[] jArr, a aVar) {
            this(str, j, fileArr, jArr);
        }

        /* JADX INFO: renamed from: a */
        public File m77829a(int i) {
            return this.f54125d[i];
        }
    }

    public C18095a(File file, int i, int i2, long j) {
        this.f54095a = file;
        this.f54099e = i;
        this.f54096b = new File(file, "journal");
        this.f54097c = new File(file, "journal.tmp");
        this.f54098d = new File(file, "journal.bkp");
        this.f54101g = i2;
        this.f54100f = j;
    }

    /* JADX INFO: renamed from: A */
    private void m77771A() throws IOException {
        C18109b c18109b = new C18109b(new FileInputStream(this.f54096b), C18123c.f54348a);
        try {
            String strM77918t = c18109b.m77918t();
            String strM77918t2 = c18109b.m77918t();
            String strM77918t3 = c18109b.m77918t();
            String strM77918t4 = c18109b.m77918t();
            String strM77918t5 = c18109b.m77918t();
            if (!"libcore.io.DiskLruCache".equals(strM77918t) || !"1".equals(strM77918t2) || !Integer.toString(this.f54099e).equals(strM77918t3) || !Integer.toString(this.f54101g).equals(strM77918t4) || !"".equals(strM77918t5)) {
                throw new IOException("unexpected journal header: [" + strM77918t + ", " + strM77918t2 + ", " + strM77918t4 + ", " + strM77918t5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    m77790e(c18109b.m77918t());
                    i++;
                } catch (EOFException unused) {
                    this.f54105k = i - this.f54104j.size();
                    if (c18109b.m77917s()) {
                        m77772B();
                    } else {
                        this.f54103i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f54096b, true), C18123c.f54348a));
                    }
                    C18123c.m78031a(c18109b);
                    return;
                }
            }
        } catch (Throwable th) {
            C18123c.m78031a(c18109b);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public synchronized void m77772B() throws IOException {
        StringBuilder sb;
        try {
            Writer writer = this.f54103i;
            if (writer != null) {
                m77784a(writer);
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f54097c), C18123c.f54348a));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write(IOUtils.LINE_SEPARATOR_UNIX);
                bufferedWriter.write("1");
                bufferedWriter.write(IOUtils.LINE_SEPARATOR_UNIX);
                bufferedWriter.write(Integer.toString(this.f54099e));
                bufferedWriter.write(IOUtils.LINE_SEPARATOR_UNIX);
                bufferedWriter.write(Integer.toString(this.f54101g));
                bufferedWriter.write(IOUtils.LINE_SEPARATOR_UNIX);
                bufferedWriter.write(IOUtils.LINE_SEPARATOR_UNIX);
                for (d dVar : this.f54104j.values()) {
                    if (dVar.f54119f != null) {
                        sb = new StringBuilder();
                        sb.append("DIRTY ");
                        sb.append(dVar.f54114a);
                        sb.append('\n');
                    } else {
                        sb = new StringBuilder();
                        sb.append("CLEAN ");
                        sb.append(dVar.f54114a);
                        sb.append(dVar.m77826a());
                        sb.append('\n');
                    }
                    bufferedWriter.write(sb.toString());
                }
                m77784a(bufferedWriter);
                if (this.f54096b.exists()) {
                    m77783a(this.f54096b, this.f54098d, true);
                }
                m77783a(this.f54097c, this.f54096b, false);
                this.f54098d.delete();
                this.f54103i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f54096b, true), C18123c.f54348a));
            } catch (Throwable th) {
                m77784a(bufferedWriter);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public void m77773C() throws IOException {
        while (this.f54102h > this.f54100f) {
            m77798d(this.f54104j.entrySet().iterator().next().getKey());
        }
    }

    /* JADX INFO: renamed from: e */
    private void m77790e(String str) throws IOException {
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
                this.f54104j.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        d dVar = this.f54104j.get(strSubstring);
        a aVar = null;
        if (dVar == null) {
            dVar = new d(this, strSubstring, aVar);
            this.f54104j.put(strSubstring, dVar);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            dVar.f54118e = true;
            dVar.f54119f = null;
            dVar.m77821b(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
            dVar.f54119f = new c(this, dVar, aVar);
        } else if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
    }

    /* JADX INFO: renamed from: x */
    private void m77793x() {
        if (this.f54103i == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public boolean m77794y() {
        int i = this.f54105k;
        return i >= 2000 && i >= this.f54104j.size();
    }

    /* JADX INFO: renamed from: z */
    private void m77795z() throws IOException {
        m77782a(this.f54097c);
        Iterator<d> it = this.f54104j.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i = 0;
            if (next.f54119f == null) {
                while (i < this.f54101g) {
                    this.f54102h += next.f54115b[i];
                    i++;
                }
            } else {
                next.f54119f = null;
                while (i < this.f54101g) {
                    m77782a(next.m77825a(i));
                    m77782a(next.m77827b(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public synchronized e m77797c(String str) throws Throwable {
        Throwable th;
        try {
            try {
                m77793x();
                d dVar = this.f54104j.get(str);
                if (dVar == null) {
                    return null;
                }
                if (!dVar.f54118e) {
                    return null;
                }
                for (File file : dVar.f54116c) {
                    try {
                        if (!file.exists()) {
                            return null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                this.f54105k++;
                this.f54103i.append((CharSequence) "READ");
                this.f54103i.append(ControlChar.SPACE_CHAR);
                this.f54103i.append((CharSequence) str);
                this.f54103i.append('\n');
                if (m77794y()) {
                    this.f54107m.submit(this.f54108n);
                }
                return new e(this, str, dVar.f54120g, dVar.f54116c, dVar.f54115b, null);
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        th = th;
        throw th;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        try {
            if (this.f54103i == null) {
                return;
            }
            for (d dVar : new ArrayList(this.f54104j.values())) {
                if (dVar.f54119f != null) {
                    dVar.f54119f.m77809a();
                }
            }
            m77773C();
            m77784a(this.f54103i);
            this.f54103i = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void flush() throws IOException {
        m77793x();
        m77773C();
        m77787b(this.f54103i);
    }

    /* JADX INFO: renamed from: j */
    public synchronized void m77799j(long j) {
        this.f54100f = j;
        this.f54107m.submit(this.f54108n);
    }

    /* JADX INFO: renamed from: s */
    public void m77800s() throws IOException {
        close();
        C18123c.m78032a(this.f54095a);
    }

    /* JADX INFO: renamed from: t */
    public File m77801t() {
        return this.f54095a;
    }

    /* JADX INFO: renamed from: u */
    public synchronized long m77802u() {
        return this.f54100f;
    }

    /* JADX INFO: renamed from: v */
    public synchronized boolean m77803v() {
        return this.f54103i == null;
    }

    /* JADX INFO: renamed from: w */
    public synchronized long m77804w() {
        return this.f54102h;
    }

    /* JADX INFO: renamed from: b */
    public c m77796b(String str) throws IOException {
        return m77776a(str, -1L);
    }

    /* JADX INFO: renamed from: d */
    public synchronized boolean m77798d(String str) throws IOException {
        try {
            m77793x();
            d dVar = this.f54104j.get(str);
            if (dVar != null && dVar.f54119f == null) {
                for (int i = 0; i < this.f54101g; i++) {
                    File fileM77825a = dVar.m77825a(i);
                    if (fileM77825a.exists() && !fileM77825a.delete()) {
                        throw new IOException("failed to delete " + fileM77825a);
                    }
                    this.f54102h -= dVar.f54115b[i];
                    dVar.f54115b[i] = 0;
                }
                this.f54105k++;
                this.f54103i.append((CharSequence) "REMOVE");
                this.f54103i.append(ControlChar.SPACE_CHAR);
                this.f54103i.append((CharSequence) str);
                this.f54103i.append('\n');
                this.f54104j.remove(str);
                if (m77794y()) {
                    this.f54107m.submit(this.f54108n);
                }
                return true;
            }
            return false;
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public synchronized c m77776a(String str, long j) throws IOException {
        m77793x();
        d dVar = this.f54104j.get(str);
        a aVar = null;
        if (j != -1 && (dVar == null || dVar.f54120g != j)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(this, str, aVar);
            this.f54104j.put(str, dVar);
        } else if (dVar.f54119f != null) {
            return null;
        }
        c cVar = new c(this, dVar, aVar);
        dVar.f54119f = cVar;
        this.f54103i.append((CharSequence) "DIRTY");
        this.f54103i.append(ControlChar.SPACE_CHAR);
        this.f54103i.append((CharSequence) str);
        this.f54103i.append('\n');
        m77787b(this.f54103i);
        return cVar;
    }

    /* JADX INFO: renamed from: b */
    public static String m77786b(InputStream inputStream) throws IOException {
        return C18123c.m78030a((Reader) new InputStreamReader(inputStream, C18123c.f54349b));
    }

    /* JADX INFO: renamed from: a */
    public static C18095a m77777a(File file, int i, int i2, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                m77783a(file2, file3, false);
            }
        }
        C18095a c18095a = new C18095a(file, i, i2, j);
        if (c18095a.f54096b.exists()) {
            try {
                c18095a.m77771A();
                c18095a.m77795z();
                return c18095a;
            } catch (IOException e2) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e2.getMessage() + ", removing");
                c18095a.m77800s();
            }
        }
        file.mkdirs();
        C18095a c18095a2 = new C18095a(file, i, i2, j);
        c18095a2.m77772B();
        return c18095a2;
    }

    /* JADX INFO: renamed from: b */
    public static void m77787b(Writer writer) throws IOException {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public synchronized void m77780a(c cVar, boolean z) throws IOException {
        d dVar = cVar.f54110a;
        if (dVar.f54119f != cVar) {
            throw new IllegalStateException();
        }
        if (z && !dVar.f54118e) {
            for (int i = 0; i < this.f54101g; i++) {
                if (!cVar.f54111b[i]) {
                    cVar.m77809a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                }
                if (!dVar.m77827b(i).exists()) {
                    cVar.m77809a();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < this.f54101g; i2++) {
            File fileM77827b = dVar.m77827b(i2);
            if (!z) {
                m77782a(fileM77827b);
            } else if (fileM77827b.exists()) {
                File fileM77825a = dVar.m77825a(i2);
                fileM77827b.renameTo(fileM77825a);
                long j = dVar.f54115b[i2];
                long length = fileM77825a.length();
                dVar.f54115b[i2] = length;
                this.f54102h = (this.f54102h - j) + length;
            }
        }
        this.f54105k++;
        dVar.f54119f = null;
        if (!(dVar.f54118e | z)) {
            this.f54104j.remove(dVar.f54114a);
            this.f54103i.append((CharSequence) "REMOVE");
            this.f54103i.append(ControlChar.SPACE_CHAR);
            this.f54103i.append((CharSequence) dVar.f54114a);
            this.f54103i.append('\n');
        } else {
            dVar.f54118e = true;
            this.f54103i.append((CharSequence) "CLEAN");
            this.f54103i.append(ControlChar.SPACE_CHAR);
            this.f54103i.append((CharSequence) dVar.f54114a);
            this.f54103i.append((CharSequence) dVar.m77826a());
            this.f54103i.append('\n');
            if (z) {
                long j2 = this.f54106l;
                this.f54106l = 1 + j2;
                dVar.f54120g = j2;
            }
        }
        m77787b(this.f54103i);
        if (this.f54102h > this.f54100f || m77794y()) {
            this.f54107m.submit(this.f54108n);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m77782a(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m77783a(File file, File file2, boolean z) throws IOException {
        if (z) {
            m77782a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m77784a(Writer writer) throws IOException {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
