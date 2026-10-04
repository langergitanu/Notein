package com.huawei.hms.drive;

import androidx.core.content.C21638OooO0Oo;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: com.huawei.hms.drive.dg */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC17851dg {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC17851dg f53358a = new InterfaceC17851dg() { // from class: com.huawei.hms.drive.dg.1
        @Override // com.huawei.hms.drive.InterfaceC17851dg
        /* JADX INFO: renamed from: a */
        public void mo76714a(File file) throws IOException {
            if (!file.delete() && file.exists()) {
                throw new IOException(C21638OooO0Oo.OooO00o(file, "failed to delete "));
            }
        }

        @Override // com.huawei.hms.drive.InterfaceC17851dg
        /* JADX INFO: renamed from: b */
        public boolean mo76716b(File file) {
            return file.exists();
        }

        @Override // com.huawei.hms.drive.InterfaceC17851dg
        /* JADX INFO: renamed from: c */
        public long mo76717c(File file) {
            return file.length();
        }

        @Override // com.huawei.hms.drive.InterfaceC17851dg
        /* JADX INFO: renamed from: a */
        public void mo76715a(File file, File file2) throws IOException {
            mo76714a(file2);
            if (file.renameTo(file2)) {
                return;
            }
            throw new IOException("failed to rename " + file + " to " + file2);
        }
    };

    /* JADX INFO: renamed from: a */
    void mo76714a(File file) throws IOException;

    /* JADX INFO: renamed from: a */
    void mo76715a(File file, File file2) throws IOException;

    /* JADX INFO: renamed from: b */
    boolean mo76716b(File file);

    /* JADX INFO: renamed from: c */
    long mo76717c(File file);
}
