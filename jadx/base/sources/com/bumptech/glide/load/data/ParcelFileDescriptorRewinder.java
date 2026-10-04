package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import com.bumptech.glide.load.data.InterfaceC22256OooO0o0;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class ParcelFileDescriptorRewinder implements InterfaceC22256OooO0o0<ParcelFileDescriptor> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InternalRewinder f67219OooO00o;

    public static final class InternalRewinder {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ParcelFileDescriptor f67220OooO00o;

        public InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.f67220OooO00o = parcelFileDescriptor;
        }

        public ParcelFileDescriptor rewind() throws IOException {
            ParcelFileDescriptor parcelFileDescriptor = this.f67220OooO00o;
            try {
                Os.lseek(parcelFileDescriptor.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
                return parcelFileDescriptor;
            } catch (ErrnoException e) {
                throw new IOException(e);
            }
        }
    }

    public static final class OooO00o implements InterfaceC22256OooO0o0.OooO00o<ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.data.InterfaceC22256OooO0o0.OooO00o
        public final Class<ParcelFileDescriptor> OooO00o() {
            return ParcelFileDescriptor.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC22256OooO0o0.OooO00o
        public final InterfaceC22256OooO0o0<ParcelFileDescriptor> OooO0O0(ParcelFileDescriptor parcelFileDescriptor) {
            return new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }
    }

    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.f67219OooO00o = new InternalRewinder(parcelFileDescriptor);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC22256OooO0o0
    public final ParcelFileDescriptor OooO00o() throws IOException {
        return this.f67219OooO00o.rewind();
    }

    @Override // com.bumptech.glide.load.data.InterfaceC22256OooO0o0
    public final void OooO0O0() {
    }

    public final ParcelFileDescriptor OooO0OO() throws IOException {
        return this.f67219OooO00o.rewind();
    }
}
