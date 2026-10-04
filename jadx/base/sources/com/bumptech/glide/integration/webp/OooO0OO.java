package com.bumptech.glide.integration.webp;

import androidx.core.internal.view.SupportMenu;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import o00OooOO.C25159OooO0oO;
import o00o000.OooOo;

/* JADX INFO: loaded from: classes5.dex */
public final class OooO0OO {

    public static final class OooO00o implements InterfaceC19098OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final byte[] f67178OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f67179OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f67180OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f67181OooO0Oo;

        public OooO00o(byte[] bArr, int i, int i2) {
            this.f67178OooO00o = bArr;
            this.f67179OooO0O0 = i;
            this.f67180OooO0OO = i2;
            this.f67181OooO0Oo = i;
        }

        @Override // com.bumptech.glide.integration.webp.OooO0OO.InterfaceC19098OooO0OO
        public final int OooO00o() throws IOException {
            return ((OooO0OO() << 8) & 65280) | (OooO0OO() & 255);
        }

        @Override // com.bumptech.glide.integration.webp.OooO0OO.InterfaceC19098OooO0OO
        public final long OooO0O0() throws IOException {
            int iMin = (int) Math.min((this.f67179OooO0O0 + this.f67180OooO0OO) - this.f67181OooO0Oo, 4L);
            this.f67181OooO0Oo += iMin;
            return iMin;
        }

        @Override // com.bumptech.glide.integration.webp.OooO0OO.InterfaceC19098OooO0OO
        public final int OooO0OO() throws IOException {
            int i = this.f67181OooO0Oo;
            if (i >= this.f67179OooO0O0 + this.f67180OooO0OO) {
                return -1;
            }
            this.f67181OooO0Oo = i + 1;
            return this.f67178OooO00o[i];
        }
    }

    public static final class OooO0O0 implements InterfaceC19098OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ByteBuffer f67182OooO00o;

        public OooO0O0(ByteBuffer byteBuffer) {
            this.f67182OooO00o = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.integration.webp.OooO0OO.InterfaceC19098OooO0OO
        public final int OooO00o() throws IOException {
            return ((OooO0OO() << 8) & 65280) | (OooO0OO() & 255);
        }

        @Override // com.bumptech.glide.integration.webp.OooO0OO.InterfaceC19098OooO0OO
        public final long OooO0O0() throws IOException {
            ByteBuffer byteBuffer = this.f67182OooO00o;
            int iMin = (int) Math.min(byteBuffer.remaining(), 4L);
            byteBuffer.position(byteBuffer.position() + iMin);
            return iMin;
        }

        @Override // com.bumptech.glide.integration.webp.OooO0OO.InterfaceC19098OooO0OO
        public final int OooO0OO() throws IOException {
            ByteBuffer byteBuffer = this.f67182OooO00o;
            if (byteBuffer.remaining() < 1) {
                return -1;
            }
            return byteBuffer.get();
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.integration.webp.OooO0OO$OooO0OO, reason: collision with other inner class name */
    public interface InterfaceC19098OooO0OO {
        int OooO00o() throws IOException;

        long OooO0O0() throws IOException;

        int OooO0OO() throws IOException;
    }

    public static final class OooO0Oo implements InterfaceC19098OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final InputStream f67183OooO00o;

        public OooO0Oo(InputStream inputStream) {
            this.f67183OooO00o = inputStream;
        }

        @Override // com.bumptech.glide.integration.webp.OooO0OO.InterfaceC19098OooO0OO
        public final int OooO00o() throws IOException {
            InputStream inputStream = this.f67183OooO00o;
            return (inputStream.read() & 255) | ((inputStream.read() << 8) & 65280);
        }

        @Override // com.bumptech.glide.integration.webp.OooO0OO.InterfaceC19098OooO0OO
        public final long OooO0O0() throws IOException {
            long j = 4;
            while (j > 0) {
                InputStream inputStream = this.f67183OooO00o;
                long jSkip = inputStream.skip(j);
                if (jSkip > 0) {
                    j -= jSkip;
                } else {
                    if (inputStream.read() == -1) {
                        break;
                    }
                    j--;
                }
            }
            return 4 - j;
        }

        @Override // com.bumptech.glide.integration.webp.OooO0OO.InterfaceC19098OooO0OO
        public final int OooO0OO() throws IOException {
            return this.f67183OooO00o.read();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: com.bumptech.glide.integration.webp.OooO0OO$OooO0o0, reason: case insensitive filesystem */
    public static final class EnumC22254OooO0o0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final EnumC22254OooO0o0 f67184OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final EnumC22254OooO0o0 f67185OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final EnumC22254OooO0o0 f67186OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final EnumC22254OooO0o0 f67187OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public static final EnumC22254OooO0o0 f67188OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public static final EnumC22254OooO0o0 f67189OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public static final EnumC22254OooO0o0 f67190OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public static final /* synthetic */ EnumC22254OooO0o0[] f67191OooOooO;

        static {
            EnumC22254OooO0o0 enumC22254OooO0o0 = new EnumC22254OooO0o0("WEBP_SIMPLE", 0);
            f67185OooOo0o = enumC22254OooO0o0;
            EnumC22254OooO0o0 enumC22254OooO0o02 = new EnumC22254OooO0o0("WEBP_LOSSLESS", 1);
            f67184OooOo = enumC22254OooO0o02;
            EnumC22254OooO0o0 enumC22254OooO0o03 = new EnumC22254OooO0o0("WEBP_LOSSLESS_WITH_ALPHA", 2);
            f67187OooOoO0 = enumC22254OooO0o03;
            EnumC22254OooO0o0 enumC22254OooO0o04 = new EnumC22254OooO0o0("WEBP_EXTENDED", 3);
            f67186OooOoO = enumC22254OooO0o04;
            EnumC22254OooO0o0 enumC22254OooO0o05 = new EnumC22254OooO0o0("WEBP_EXTENDED_WITH_ALPHA", 4);
            f67188OooOoOO = enumC22254OooO0o05;
            EnumC22254OooO0o0 enumC22254OooO0o06 = new EnumC22254OooO0o0("WEBP_EXTENDED_ANIMATED", 5);
            f67190OooOoo0 = enumC22254OooO0o06;
            EnumC22254OooO0o0 enumC22254OooO0o07 = new EnumC22254OooO0o0("NONE_WEBP", 6);
            f67189OooOoo = enumC22254OooO0o07;
            f67191OooOooO = new EnumC22254OooO0o0[]{enumC22254OooO0o0, enumC22254OooO0o02, enumC22254OooO0o03, enumC22254OooO0o04, enumC22254OooO0o05, enumC22254OooO0o06, enumC22254OooO0o07};
        }

        public EnumC22254OooO0o0() {
            throw null;
        }

        public static EnumC22254OooO0o0 valueOf(String str) {
            return (EnumC22254OooO0o0) Enum.valueOf(EnumC22254OooO0o0.class, str);
        }

        public static EnumC22254OooO0o0[] values() {
            return (EnumC22254OooO0o0[]) f67191OooOooO.clone();
        }
    }

    public static EnumC22254OooO0o0 OooO00o(InterfaceC19098OooO0OO interfaceC19098OooO0OO) throws IOException {
        int iOooO00o = ((interfaceC19098OooO0OO.OooO00o() << 16) & SupportMenu.CATEGORY_MASK) | (interfaceC19098OooO0OO.OooO00o() & 65535);
        EnumC22254OooO0o0 enumC22254OooO0o0 = EnumC22254OooO0o0.f67189OooOoo;
        if (iOooO00o == 1380533830) {
            interfaceC19098OooO0OO.OooO0O0();
            if ((((interfaceC19098OooO0OO.OooO00o() << 16) & SupportMenu.CATEGORY_MASK) | (interfaceC19098OooO0OO.OooO00o() & 65535)) == 1464156752) {
                int iOooO00o2 = ((interfaceC19098OooO0OO.OooO00o() << 16) & SupportMenu.CATEGORY_MASK) | (interfaceC19098OooO0OO.OooO00o() & 65535);
                if (iOooO00o2 == 1448097824) {
                    return EnumC22254OooO0o0.f67185OooOo0o;
                }
                if (iOooO00o2 == 1448097868) {
                    interfaceC19098OooO0OO.OooO0O0();
                    return (interfaceC19098OooO0OO.OooO0OO() & 8) != 0 ? EnumC22254OooO0o0.f67187OooOoO0 : EnumC22254OooO0o0.f67184OooOo;
                }
                if (iOooO00o2 == 1448097880) {
                    interfaceC19098OooO0OO.OooO0O0();
                    int iOooO0OO = interfaceC19098OooO0OO.OooO0OO();
                    return (iOooO0OO & 2) != 0 ? EnumC22254OooO0o0.f67190OooOoo0 : (iOooO0OO & 16) != 0 ? EnumC22254OooO0o0.f67188OooOoOO : EnumC22254OooO0o0.f67186OooOoO;
                }
            }
        }
        return enumC22254OooO0o0;
    }

    public static EnumC22254OooO0o0 OooO0O0(InputStream inputStream, C25159OooO0oO c25159OooO0oO) throws IOException {
        if (inputStream == null) {
            return EnumC22254OooO0o0.f67189OooOoo;
        }
        if (!inputStream.markSupported()) {
            inputStream = new OooOo(inputStream, c25159OooO0oO);
        }
        inputStream.mark(21);
        try {
            return OooO00o(new OooO0Oo(inputStream));
        } finally {
            inputStream.reset();
        }
    }

    public static boolean OooO0OO(EnumC22254OooO0o0 enumC22254OooO0o0) {
        return enumC22254OooO0o0 == EnumC22254OooO0o0.f67185OooOo0o || enumC22254OooO0o0 == EnumC22254OooO0o0.f67184OooOo || enumC22254OooO0o0 == EnumC22254OooO0o0.f67187OooOoO0 || enumC22254OooO0o0 == EnumC22254OooO0o0.f67186OooOoO || enumC22254OooO0o0 == EnumC22254OooO0o0.f67188OooOoOO;
    }
}
