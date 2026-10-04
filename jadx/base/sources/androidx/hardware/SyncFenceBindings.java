package androidx.hardware;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m80612d2 = {"Landroidx/hardware/SyncFenceBindings;", "", "<init>", "()V", "Companion", "graphics-core_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class SyncFenceBindings {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Companion f65152OooO00o = new Companion();

    @Metadata(m80611d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0007\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0087 ¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0087 ¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m80612d2 = {"Landroidx/hardware/SyncFenceBindings$Companion;", "", "<init>", "()V", "", "nResolveSyncFileInfo", "()Z", "nResolveSyncFileInfoFree", "", "fd", "", "nGetSignalTime", "(I)J", "LoO00ooO/OooOooO;", "nForceClose", "(I)V", "graphics-core_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final class Companion {
        public final void nForceClose(int fd) {
            SyncFenceBindings.nForceClose(fd);
        }

        public final long nGetSignalTime(int fd) {
            return SyncFenceBindings.nGetSignalTime(fd);
        }

        public final boolean nResolveSyncFileInfo() {
            return SyncFenceBindings.nResolveSyncFileInfo();
        }

        public final boolean nResolveSyncFileInfoFree() {
            return SyncFenceBindings.nResolveSyncFileInfoFree();
        }
    }

    static {
        System.loadLibrary("graphics-core");
    }

    private SyncFenceBindings() {
    }

    public static final native void nForceClose(int i);

    public static final native long nGetSignalTime(int i);

    public static final native boolean nResolveSyncFileInfo();

    public static final native boolean nResolveSyncFileInfoFree();
}
