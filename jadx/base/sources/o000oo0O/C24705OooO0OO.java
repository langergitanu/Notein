package o000oo0O;

import OooOoo.C20593OooO0Oo;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o000oo0O.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24705OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f83752OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public FileChannel f83753OooO0O0;

    public C24705OooO0OO(String filename) {
        OooOOO0.OooO0oO(filename, "filename");
        this.f83752OooO00o = filename.concat(".lck");
    }

    public final void OooO00o() throws IOException {
        String str = this.f83752OooO00o;
        if (this.f83753OooO0O0 != null) {
            return;
        }
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileChannel channel = new FileOutputStream(file).getChannel();
            this.f83753OooO0O0 = channel;
            if (channel != null) {
                channel.lock();
            }
        } catch (Throwable th) {
            FileChannel fileChannel = this.f83753OooO0O0;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.f83753OooO0O0 = null;
            throw new IllegalStateException(C20593OooO0Oo.OooO0O0("Unable to lock file: '", str, "'."), th);
        }
    }
}
