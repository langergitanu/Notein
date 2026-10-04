package com.huawei.hms.network.embedded;

import androidx.core.content.C21638OooO0Oo;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.oa */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC18302oa {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC18302oa f55840a = new a();

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.oa$a */
    public class a implements InterfaceC18302oa {
        @Override // com.huawei.hms.network.embedded.InterfaceC18302oa
        /* JADX INFO: renamed from: a */
        public void mo79279a(File file, File file2) throws IOException {
            mo79281b(file2);
            if (file.renameTo(file2)) {
                return;
            }
            throw new IOException("failed to rename " + file + " to " + file2);
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18302oa
        /* JADX INFO: renamed from: b */
        public void mo79281b(File file) throws IOException {
            if (!file.delete() && file.exists()) {
                throw new IOException(C21638OooO0Oo.OooO00o(file, "failed to delete "));
            }
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18302oa
        /* JADX INFO: renamed from: c */
        public InterfaceC18234jc mo79282c(File file) throws FileNotFoundException {
            return C18433yb.m80013c(file);
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18302oa
        /* JADX INFO: renamed from: d */
        public long mo79283d(File file) {
            return file.length();
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18302oa
        /* JADX INFO: renamed from: e */
        public InterfaceC18220ic mo79284e(File file) throws FileNotFoundException {
            try {
                return C18433yb.m80009b(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return C18433yb.m80009b(file);
            }
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18302oa
        /* JADX INFO: renamed from: f */
        public void mo79285f(File file) throws IOException {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                throw new IOException(C21638OooO0Oo.OooO00o(file, "not a readable directory: "));
            }
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    mo79285f(file2);
                }
                if (!file2.delete()) {
                    throw new IOException(C21638OooO0Oo.OooO00o(file2, "failed to delete "));
                }
            }
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18302oa
        /* JADX INFO: renamed from: g */
        public InterfaceC18220ic mo79286g(File file) throws FileNotFoundException {
            try {
                return C18433yb.m79999a(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return C18433yb.m79999a(file);
            }
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18302oa
        /* JADX INFO: renamed from: a */
        public boolean mo79280a(File file) {
            return file.exists();
        }
    }

    /* JADX INFO: renamed from: a */
    void mo79279a(File file, File file2) throws IOException;

    /* JADX INFO: renamed from: a */
    boolean mo79280a(File file);

    /* JADX INFO: renamed from: b */
    void mo79281b(File file) throws IOException;

    /* JADX INFO: renamed from: c */
    InterfaceC18234jc mo79282c(File file) throws FileNotFoundException;

    /* JADX INFO: renamed from: d */
    long mo79283d(File file);

    /* JADX INFO: renamed from: e */
    InterfaceC18220ic mo79284e(File file) throws FileNotFoundException;

    /* JADX INFO: renamed from: f */
    void mo79285f(File file) throws IOException;

    /* JADX INFO: renamed from: g */
    InterfaceC18220ic mo79286g(File file) throws FileNotFoundException;
}
