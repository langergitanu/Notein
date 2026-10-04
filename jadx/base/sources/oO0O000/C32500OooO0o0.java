package oO0O000;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32442OooOO0o;
import oO0o0O0O.InterfaceC33569OooO0oo;
import oOo000Oo.AbstractC34420OooO0OO;

/* JADX INFO: renamed from: oO0O000.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32500OooO0o0 implements InterfaceC33569OooO0oo<File> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final File f116778OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0o f116779OooO0O0;

    /* JADX INFO: renamed from: oO0O000.OooO0o0$OooO00o */
    public static abstract class OooO00o extends OooO0OO {
    }

    /* JADX INFO: renamed from: oO0O000.OooO0o0$OooO0O0 */
    public final class OooO0O0 extends AbstractC34420OooO0OO<File> {

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final ArrayDeque<OooO0OO> f116781OooOoO0;

        /* JADX INFO: renamed from: oO0O000.OooO0o0$OooO0O0$OooO00o */
        public final class OooO00o extends OooO00o {

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public boolean f116782OooO0O0;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public File[] f116783OooO0OO;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f116784OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ OooO0O0 f116785OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public boolean f116786OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(OooO0O0 oooO0O0, File rootDir) {
                super(rootDir);
                OooOOO0.OooO0oO(rootDir, "rootDir");
                this.f116785OooO0o = oooO0O0;
            }

            @Override // oO0O000.C32500OooO0o0.OooO0OO
            public final File OooO00o() {
                boolean z = this.f116786OooO0o0;
                File file = this.f116792OooO00o;
                OooO0O0 oooO0O0 = this.f116785OooO0o;
                if (!z && this.f116783OooO0OO == null) {
                    C32500OooO0o0.this.getClass();
                    File[] fileArrListFiles = file.listFiles();
                    this.f116783OooO0OO = fileArrListFiles;
                    if (fileArrListFiles == null) {
                        C32500OooO0o0.this.getClass();
                        this.f116786OooO0o0 = true;
                    }
                }
                File[] fileArr = this.f116783OooO0OO;
                if (fileArr != null && this.f116784OooO0Oo < fileArr.length) {
                    OooOOO0.OooO0Oo(fileArr);
                    int i = this.f116784OooO0Oo;
                    this.f116784OooO0Oo = i + 1;
                    return fileArr[i];
                }
                if (this.f116782OooO0O0) {
                    C32500OooO0o0.this.getClass();
                    return null;
                }
                this.f116782OooO0O0 = true;
                return file;
            }
        }

        /* JADX INFO: renamed from: oO0O000.OooO0o0$OooO0O0$OooO0O0, reason: collision with other inner class name */
        public final class C20237OooO0O0 extends OooO0OO {

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public boolean f116787OooO0O0;

            @Override // oO0O000.C32500OooO0o0.OooO0OO
            public final File OooO00o() {
                if (this.f116787OooO0O0) {
                    return null;
                }
                this.f116787OooO0O0 = true;
                return this.f116792OooO00o;
            }
        }

        /* JADX INFO: renamed from: oO0O000.OooO0o0$OooO0O0$OooO0OO */
        public final class OooO0OO extends OooO00o {

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public boolean f116788OooO0O0;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public File[] f116789OooO0OO;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f116790OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ OooO0O0 f116791OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(OooO0O0 oooO0O0, File rootDir) {
                super(rootDir);
                OooOOO0.OooO0oO(rootDir, "rootDir");
                this.f116791OooO0o0 = oooO0O0;
            }

            @Override // oO0O000.C32500OooO0o0.OooO0OO
            public final File OooO00o() {
                boolean z = this.f116788OooO0O0;
                File file = this.f116792OooO00o;
                OooO0O0 oooO0O0 = this.f116791OooO0o0;
                if (!z) {
                    C32500OooO0o0.this.getClass();
                    this.f116788OooO0O0 = true;
                    return file;
                }
                File[] fileArr = this.f116789OooO0OO;
                if (fileArr != null && this.f116790OooO0Oo >= fileArr.length) {
                    C32500OooO0o0.this.getClass();
                    return null;
                }
                if (fileArr == null) {
                    File[] fileArrListFiles = file.listFiles();
                    this.f116789OooO0OO = fileArrListFiles;
                    if (fileArrListFiles == null) {
                        C32500OooO0o0.this.getClass();
                    }
                    File[] fileArr2 = this.f116789OooO0OO;
                    if (fileArr2 == null || fileArr2.length == 0) {
                        C32500OooO0o0.this.getClass();
                        return null;
                    }
                }
                File[] fileArr3 = this.f116789OooO0OO;
                OooOOO0.OooO0Oo(fileArr3);
                int i = this.f116790OooO0Oo;
                this.f116790OooO0Oo = i + 1;
                return fileArr3[i];
            }
        }

        public OooO0O0() {
            ArrayDeque<OooO0OO> arrayDeque = new ArrayDeque<>();
            this.f116781OooOoO0 = arrayDeque;
            if (C32500OooO0o0.this.f116778OooO00o.isDirectory()) {
                arrayDeque.push(OooO0O0(C32500OooO0o0.this.f116778OooO00o));
            } else {
                if (!C32500OooO0o0.this.f116778OooO00o.isFile()) {
                    this.f123435OooOo0o = 2;
                    return;
                }
                File rootFile = C32500OooO0o0.this.f116778OooO00o;
                OooOOO0.OooO0oO(rootFile, "rootFile");
                arrayDeque.push(new C20237OooO0O0(rootFile));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // oOo000Oo.AbstractC34420OooO0OO
        public final void OooO00o() {
            T t;
            File fileOooO00o;
            while (true) {
                ArrayDeque<OooO0OO> arrayDeque = this.f116781OooOoO0;
                OooO0OO oooO0OOPeek = arrayDeque.peek();
                if (oooO0OOPeek == null) {
                    t = 0;
                    break;
                }
                fileOooO00o = oooO0OOPeek.OooO00o();
                if (fileOooO00o == null) {
                    arrayDeque.pop();
                } else {
                    if (fileOooO00o.equals(oooO0OOPeek.f116792OooO00o) || !fileOooO00o.isDirectory()) {
                        break;
                    }
                    int size = arrayDeque.size();
                    C32500OooO0o0.this.getClass();
                    if (size >= Integer.MAX_VALUE) {
                        break;
                    } else {
                        arrayDeque.push(OooO0O0(fileOooO00o));
                    }
                }
            }
            t = fileOooO00o;
            if (t == 0) {
                this.f123435OooOo0o = 2;
            } else {
                this.f123434OooOo = t;
                this.f123435OooOo0o = 1;
            }
        }

        public final OooO00o OooO0O0(File file) {
            int iOrdinal = C32500OooO0o0.this.f116779OooO0O0.ordinal();
            if (iOrdinal == 0) {
                return new OooO0OO(this, file);
            }
            if (iOrdinal == 1) {
                return new OooO00o(this, file);
            }
            throw new C32442OooOO0o();
        }
    }

    /* JADX INFO: renamed from: oO0O000.OooO0o0$OooO0OO */
    public static abstract class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final File f116792OooO00o;

        public OooO0OO(File root) {
            OooOOO0.OooO0oO(root, "root");
            this.f116792OooO00o = root;
        }

        public abstract File OooO00o();
    }

    public C32500OooO0o0(File start) {
        OooO0o oooO0o = OooO0o.f116777OooOo0o;
        OooOOO0.OooO0oO(start, "start");
        this.f116778OooO00o = start;
        this.f116779OooO0O0 = oooO0o;
    }

    @Override // oO0o0O0O.InterfaceC33569OooO0oo
    public final Iterator<File> iterator() {
        return new OooO0O0();
    }
}
