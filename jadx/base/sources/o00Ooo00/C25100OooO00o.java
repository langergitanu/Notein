package o00Ooo00;

import android.os.StrictMode;
import com.aspose.words.ControlChar;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: o00Ooo00.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25100OooO00o implements Closeable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final File f85255OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final File f85256OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final File f85257OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final File f85258OooOoO0;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final long f85261OooOoo0;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public BufferedWriter f85263OooOooo;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public int f85266Oooo00O;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public long f85262OooOooO = 0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final LinkedHashMap<String, C25101OooO0Oo> f85265Oooo000 = new LinkedHashMap<>(0, 0.75f, true);

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public long f85267Oooo00o = 0;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final ThreadPoolExecutor f85264Oooo0 = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new OooO0O0());

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final CallableC19676OooO00o f85268Oooo0O0 = new CallableC19676OooO00o();

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final int f85259OooOoOO = 1;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final int f85260OooOoo = 1;

    /* JADX INFO: renamed from: o00Ooo00.OooO00o$OooO00o, reason: collision with other inner class name */
    public class CallableC19676OooO00o implements Callable<Void> {
        public CallableC19676OooO00o() {
        }

        @Override // java.util.concurrent.Callable
        public final Void call() throws Exception {
            synchronized (C25100OooO00o.this) {
                try {
                    C25100OooO00o c25100OooO00o = C25100OooO00o.this;
                    if (c25100OooO00o.f85263OooOooo == null) {
                        return null;
                    }
                    c25100OooO00o.o00000OO();
                    if (C25100OooO00o.this.Oooo000()) {
                        C25100OooO00o.this.o00Oo0();
                        C25100OooO00o.this.f85266Oooo00O = 0;
                    }
                    return null;
                } finally {
                }
            }
        }
    }

    /* JADX INFO: renamed from: o00Ooo00.OooO00o$OooO0O0 */
    public static final class OooO0O0 implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public final synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    /* JADX INFO: renamed from: o00Ooo00.OooO00o$OooO0OO */
    public final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C25101OooO0Oo f85270OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean[] f85271OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f85272OooO0OO;

        public OooO0OO(C25101OooO0Oo c25101OooO0Oo) {
            this.f85270OooO00o = c25101OooO0Oo;
            this.f85271OooO0O0 = c25101OooO0Oo.f85279OooO0o0 ? null : new boolean[C25100OooO00o.this.f85260OooOoo];
        }

        public final void OooO00o() throws IOException {
            C25100OooO00o.OooO00o(C25100OooO00o.this, this, false);
        }

        public final File OooO0O0() throws IOException {
            File file;
            synchronized (C25100OooO00o.this) {
                try {
                    C25101OooO0Oo c25101OooO0Oo = this.f85270OooO00o;
                    if (c25101OooO0Oo.f85278OooO0o != this) {
                        throw new IllegalStateException();
                    }
                    if (!c25101OooO0Oo.f85279OooO0o0) {
                        this.f85271OooO0O0[0] = true;
                    }
                    file = c25101OooO0Oo.f85277OooO0Oo[0];
                    C25100OooO00o.this.f85256OooOo0o.mkdirs();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return file;
        }
    }

    /* JADX INFO: renamed from: o00Ooo00.OooO00o$OooO0Oo, reason: case insensitive filesystem */
    public final class C25101OooO0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f85274OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long[] f85275OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final File[] f85276OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final File[] f85277OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public OooO0OO f85278OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f85279OooO0o0;

        public C25101OooO0Oo(String str) {
            this.f85274OooO00o = str;
            int i = C25100OooO00o.this.f85260OooOoo;
            this.f85275OooO0O0 = new long[i];
            this.f85276OooO0OO = new File[i];
            this.f85277OooO0Oo = new File[i];
            StringBuilder sb = new StringBuilder(str);
            sb.append(FilenameUtils.EXTENSION_SEPARATOR);
            int length = sb.length();
            for (int i2 = 0; i2 < C25100OooO00o.this.f85260OooOoo; i2++) {
                sb.append(i2);
                File[] fileArr = this.f85276OooO0OO;
                String string = sb.toString();
                File file = C25100OooO00o.this.f85256OooOo0o;
                fileArr[i2] = new File(file, string);
                sb.append(".tmp");
                this.f85277OooO0Oo[i2] = new File(file, sb.toString());
                sb.setLength(length);
            }
        }

        public final String OooO00o() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long j : this.f85275OooO0O0) {
                sb.append(ControlChar.SPACE_CHAR);
                sb.append(j);
            }
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: o00Ooo00.OooO00o$OooO0o0, reason: case insensitive filesystem */
    public final class C25102OooO0o0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final File[] f85281OooO00o;

        public C25102OooO0o0(File[] fileArr) {
            this.f85281OooO00o = fileArr;
        }
    }

    public C25100OooO00o(File file, long j) {
        this.f85256OooOo0o = file;
        this.f85255OooOo = new File(file, "journal");
        this.f85258OooOoO0 = new File(file, "journal.tmp");
        this.f85257OooOoO = new File(file, "journal.bkp");
        this.f85261OooOoo0 = j;
    }

    public static void OooO00o(C25100OooO00o c25100OooO00o, OooO0OO oooO0OO, boolean z) throws IOException {
        synchronized (c25100OooO00o) {
            C25101OooO0Oo c25101OooO0Oo = oooO0OO.f85270OooO00o;
            if (c25101OooO0Oo.f85278OooO0o != oooO0OO) {
                throw new IllegalStateException();
            }
            if (z && !c25101OooO0Oo.f85279OooO0o0) {
                for (int i = 0; i < c25100OooO00o.f85260OooOoo; i++) {
                    if (!oooO0OO.f85271OooO0O0[i]) {
                        oooO0OO.OooO00o();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                    if (!c25101OooO0Oo.f85277OooO0Oo[i].exists()) {
                        oooO0OO.OooO00o();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < c25100OooO00o.f85260OooOoo; i2++) {
                File file = c25101OooO0Oo.f85277OooO0Oo[i2];
                if (!z) {
                    OooOOO0(file);
                } else if (file.exists()) {
                    File file2 = c25101OooO0Oo.f85276OooO0OO[i2];
                    file.renameTo(file2);
                    long j = c25101OooO0Oo.f85275OooO0O0[i2];
                    long length = file2.length();
                    c25101OooO0Oo.f85275OooO0O0[i2] = length;
                    c25100OooO00o.f85262OooOooO = (c25100OooO00o.f85262OooOooO - j) + length;
                }
            }
            c25100OooO00o.f85266Oooo00O++;
            c25101OooO0Oo.f85278OooO0o = null;
            if (c25101OooO0Oo.f85279OooO0o0 || z) {
                c25101OooO0Oo.f85279OooO0o0 = true;
                c25100OooO00o.f85263OooOooo.append((CharSequence) "CLEAN");
                c25100OooO00o.f85263OooOooo.append(ControlChar.SPACE_CHAR);
                c25100OooO00o.f85263OooOooo.append((CharSequence) c25101OooO0Oo.f85274OooO00o);
                c25100OooO00o.f85263OooOooo.append((CharSequence) c25101OooO0Oo.OooO00o());
                c25100OooO00o.f85263OooOooo.append('\n');
                if (z) {
                    c25100OooO00o.f85267Oooo00o++;
                }
            } else {
                c25100OooO00o.f85265Oooo000.remove(c25101OooO0Oo.f85274OooO00o);
                c25100OooO00o.f85263OooOooo.append((CharSequence) "REMOVE");
                c25100OooO00o.f85263OooOooo.append(ControlChar.SPACE_CHAR);
                c25100OooO00o.f85263OooOooo.append((CharSequence) c25101OooO0Oo.f85274OooO00o);
                c25100OooO00o.f85263OooOooo.append('\n');
            }
            OooOOoo(c25100OooO00o.f85263OooOooo);
            if (c25100OooO00o.f85262OooOooO > c25100OooO00o.f85261OooOoo0 || c25100OooO00o.Oooo000()) {
                c25100OooO00o.f85264Oooo0.submit(c25100OooO00o.f85268Oooo0O0);
            }
        }
    }

    public static void OooO0OO(BufferedWriter bufferedWriter) throws IOException {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void OooOOO0(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void OooOOoo(BufferedWriter bufferedWriter) throws IOException {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static C25100OooO00o Oooo00o(File file, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                o0Oo0oo(file2, file3, false);
            }
        }
        C25100OooO00o c25100OooO00o = new C25100OooO00o(file, j);
        if (c25100OooO00o.f85255OooOo.exists()) {
            try {
                c25100OooO00o.Oooo0OO();
                c25100OooO00o.Oooo0();
                return c25100OooO00o;
            } catch (IOException e) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                c25100OooO00o.close();
                o00Ooo00.OooO0OO.OooO00o(c25100OooO00o.f85256OooOo0o);
            }
        }
        file.mkdirs();
        C25100OooO00o c25100OooO00o2 = new C25100OooO00o(file, j);
        c25100OooO00o2.o00Oo0();
        return c25100OooO00o2;
    }

    public static void o0Oo0oo(File file, File file2, boolean z) throws IOException {
        if (z) {
            OooOOO0(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public final OooO0OO OooOOo0(String str) throws IOException {
        synchronized (this) {
            try {
                if (this.f85263OooOooo == null) {
                    throw new IllegalStateException("cache is closed");
                }
                C25101OooO0Oo c25101OooO0Oo = this.f85265Oooo000.get(str);
                if (c25101OooO0Oo == null) {
                    c25101OooO0Oo = new C25101OooO0Oo(str);
                    this.f85265Oooo000.put(str, c25101OooO0Oo);
                } else if (c25101OooO0Oo.f85278OooO0o != null) {
                    return null;
                }
                OooO0OO oooO0OO = new OooO0OO(c25101OooO0Oo);
                c25101OooO0Oo.f85278OooO0o = oooO0OO;
                this.f85263OooOooo.append((CharSequence) "DIRTY");
                this.f85263OooOooo.append(ControlChar.SPACE_CHAR);
                this.f85263OooOooo.append((CharSequence) str);
                this.f85263OooOooo.append('\n');
                OooOOoo(this.f85263OooOooo);
                return oooO0OO;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized C25102OooO0o0 OooOooo(String str) throws IOException {
        if (this.f85263OooOooo == null) {
            throw new IllegalStateException("cache is closed");
        }
        C25101OooO0Oo c25101OooO0Oo = this.f85265Oooo000.get(str);
        if (c25101OooO0Oo == null) {
            return null;
        }
        if (!c25101OooO0Oo.f85279OooO0o0) {
            return null;
        }
        for (File file : c25101OooO0Oo.f85276OooO0OO) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f85266Oooo00O++;
        this.f85263OooOooo.append((CharSequence) "READ");
        this.f85263OooOooo.append(ControlChar.SPACE_CHAR);
        this.f85263OooOooo.append((CharSequence) str);
        this.f85263OooOooo.append('\n');
        if (Oooo000()) {
            this.f85264Oooo0.submit(this.f85268Oooo0O0);
        }
        return new C25102OooO0o0(c25101OooO0Oo.f85276OooO0OO);
    }

    public final void Oooo0() throws IOException {
        OooOOO0(this.f85258OooOoO0);
        Iterator<C25101OooO0Oo> it = this.f85265Oooo000.values().iterator();
        while (it.hasNext()) {
            C25101OooO0Oo next = it.next();
            OooO0OO oooO0OO = next.f85278OooO0o;
            int i = this.f85260OooOoo;
            int i2 = 0;
            if (oooO0OO == null) {
                while (i2 < i) {
                    this.f85262OooOooO += next.f85275OooO0O0[i2];
                    i2++;
                }
            } else {
                next.f85278OooO0o = null;
                while (i2 < i) {
                    OooOOO0(next.f85276OooO0OO[i2]);
                    OooOOO0(next.f85277OooO0Oo[i2]);
                    i2++;
                }
                it.remove();
            }
        }
    }

    public final boolean Oooo000() {
        int i = this.f85266Oooo00O;
        return i >= 2000 && i >= this.f85265Oooo000.size();
    }

    public final void Oooo0OO() throws IOException {
        File file = this.f85255OooOo;
        C25103OooO0O0 c25103OooO0O0 = new C25103OooO0O0(new FileInputStream(file), o00Ooo00.OooO0OO.f85288OooO00o);
        try {
            String strOooO00o = c25103OooO0O0.OooO00o();
            String strOooO00o2 = c25103OooO0O0.OooO00o();
            String strOooO00o3 = c25103OooO0O0.OooO00o();
            String strOooO00o4 = c25103OooO0O0.OooO00o();
            String strOooO00o5 = c25103OooO0O0.OooO00o();
            if (!"libcore.io.DiskLruCache".equals(strOooO00o) || !"1".equals(strOooO00o2) || !Integer.toString(this.f85259OooOoOO).equals(strOooO00o3) || !Integer.toString(this.f85260OooOoo).equals(strOooO00o4) || !"".equals(strOooO00o5)) {
                throw new IOException("unexpected journal header: [" + strOooO00o + ", " + strOooO00o2 + ", " + strOooO00o4 + ", " + strOooO00o5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    ooOO(c25103OooO0O0.OooO00o());
                    i++;
                } catch (EOFException unused) {
                    this.f85266Oooo00O = i - this.f85265Oooo000.size();
                    if (c25103OooO0O0.f85286OooOoOO == -1) {
                        o00Oo0();
                    } else {
                        this.f85263OooOooo = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), o00Ooo00.OooO0OO.f85288OooO00o));
                    }
                    try {
                        c25103OooO0O0.close();
                        return;
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                c25103OooO0O0.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        try {
            if (this.f85263OooOooo == null) {
                return;
            }
            Iterator it = new ArrayList(this.f85265Oooo000.values()).iterator();
            while (it.hasNext()) {
                OooO0OO oooO0OO = ((C25101OooO0Oo) it.next()).f85278OooO0o;
                if (oooO0OO != null) {
                    oooO0OO.OooO00o();
                }
            }
            o00000OO();
            OooO0OO(this.f85263OooOooo);
            this.f85263OooOooo = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void o00000OO() throws IOException {
        while (this.f85262OooOooO > this.f85261OooOoo0) {
            String key = this.f85265Oooo000.entrySet().iterator().next().getKey();
            synchronized (this) {
                try {
                    if (this.f85263OooOooo == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    C25101OooO0Oo c25101OooO0Oo = this.f85265Oooo000.get(key);
                    if (c25101OooO0Oo != null && c25101OooO0Oo.f85278OooO0o == null) {
                        for (int i = 0; i < this.f85260OooOoo; i++) {
                            File file = c25101OooO0Oo.f85276OooO0OO[i];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j = this.f85262OooOooO;
                            long[] jArr = c25101OooO0Oo.f85275OooO0O0;
                            this.f85262OooOooO = j - jArr[i];
                            jArr[i] = 0;
                        }
                        this.f85266Oooo00O++;
                        this.f85263OooOooo.append((CharSequence) "REMOVE");
                        this.f85263OooOooo.append(ControlChar.SPACE_CHAR);
                        this.f85263OooOooo.append((CharSequence) key);
                        this.f85263OooOooo.append('\n');
                        this.f85265Oooo000.remove(key);
                        if (Oooo000()) {
                            this.f85264Oooo0.submit(this.f85268Oooo0O0);
                        }
                    }
                } finally {
                }
            }
        }
    }

    public final synchronized void o00Oo0() throws IOException {
        try {
            BufferedWriter bufferedWriter = this.f85263OooOooo;
            if (bufferedWriter != null) {
                OooO0OO(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f85258OooOoO0), o00Ooo00.OooO0OO.f85288OooO00o));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write(IOUtils.LINE_SEPARATOR_UNIX);
                bufferedWriter2.write("1");
                bufferedWriter2.write(IOUtils.LINE_SEPARATOR_UNIX);
                bufferedWriter2.write(Integer.toString(this.f85259OooOoOO));
                bufferedWriter2.write(IOUtils.LINE_SEPARATOR_UNIX);
                bufferedWriter2.write(Integer.toString(this.f85260OooOoo));
                bufferedWriter2.write(IOUtils.LINE_SEPARATOR_UNIX);
                bufferedWriter2.write(IOUtils.LINE_SEPARATOR_UNIX);
                for (C25101OooO0Oo c25101OooO0Oo : this.f85265Oooo000.values()) {
                    if (c25101OooO0Oo.f85278OooO0o != null) {
                        bufferedWriter2.write("DIRTY " + c25101OooO0Oo.f85274OooO00o + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + c25101OooO0Oo.f85274OooO00o + c25101OooO0Oo.OooO00o() + '\n');
                    }
                }
                OooO0OO(bufferedWriter2);
                if (this.f85255OooOo.exists()) {
                    o0Oo0oo(this.f85255OooOo, this.f85257OooOoO, true);
                }
                o0Oo0oo(this.f85258OooOoO0, this.f85255OooOo, false);
                this.f85257OooOoO.delete();
                this.f85263OooOooo = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f85255OooOo, true), o00Ooo00.OooO0OO.f85288OooO00o));
            } catch (Throwable th) {
                OooO0OO(bufferedWriter2);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void ooOO(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        LinkedHashMap<String, C25101OooO0Oo> linkedHashMap = this.f85265Oooo000;
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        C25101OooO0Oo c25101OooO0Oo = linkedHashMap.get(strSubstring);
        if (c25101OooO0Oo == null) {
            c25101OooO0Oo = new C25101OooO0Oo(strSubstring);
            linkedHashMap.put(strSubstring, c25101OooO0Oo);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                c25101OooO0Oo.f85278OooO0o = new OooO0OO(c25101OooO0Oo);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
        c25101OooO0Oo.f85279OooO0o0 = true;
        c25101OooO0Oo.f85278OooO0o = null;
        if (strArrSplit.length != C25100OooO00o.this.f85260OooOoo) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
        }
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            try {
                c25101OooO0Oo.f85275OooO0O0[i2] = Long.parseLong(strArrSplit[i2]);
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
        }
    }
}
