package oO0000O;

import OooOoOO.C20519OooO0Oo;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.ECParameterSpec;
import java.util.Arrays;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import javax.security.auth.Destroyable;
import oO00000.C31906OooO0Oo;
import oO00000o.C31909OooO0o0;
import oO00000o.OooO0OO;
import oO0000O.OooOo;
import oOO00OOo.InterfaceC34352OooO0O0;

/* JADX INFO: loaded from: classes10.dex */
public abstract class OooOo implements PrivateKey, Destroyable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final oO00000o.OooO0OO f113835OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final oO00000o.OooO0o f113836OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f113837OooOoO = false;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final char[] f113838OooOoO0;

    public static class OooO00o extends OooOo implements ECKey {

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final ECPublicKey f113839OooOoOO;

        public OooO00o(oO00000o.OooO0o oooO0o, oO00000o.OooO0OO oooO0OO, ECPublicKey eCPublicKey, char[] cArr) {
            super(oooO0o, oooO0OO, cArr);
            this.f113839OooOoOO = eCPublicKey;
        }

        public final byte[] OooO0OO(oO00000.OooO00o<oO00000.OooO00o<C31906OooO0Oo<C31909OooO0o0, Exception>>> oooO00o, final ECPublicKey eCPublicKey) throws Exception {
            final ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1);
            oooO00o.invoke(new oO00000.OooO00o() { // from class: oO0000O.OooOo0O
                @Override // oO00000.OooO00o
                public final void invoke(Object obj) {
                    final C31906OooO0Oo c31906OooO0Oo = (C31906OooO0Oo) obj;
                    final OooOo.OooO00o oooO00o2 = this.f113847OooO00o;
                    oooO00o2.getClass();
                    final ECPublicKey eCPublicKey2 = eCPublicKey;
                    arrayBlockingQueue.add(C31906OooO0Oo.OooO0OO(new Callable() { // from class: oO0000O.OooOo0o
                        @Override // java.util.concurrent.Callable
                        public final Object call() throws com.yubico.yubikit.core.smartcard.OooO0O0, oO00000o.OooO0O0, IOException {
                            OooOo.OooO00o oooO00o3 = oooO00o2;
                            oooO00o3.getClass();
                            C31909OooO0o0 c31909OooO0o0 = (C31909OooO0o0) c31906OooO0Oo.OooO0O0();
                            char[] cArr = oooO00o3.f113838OooOoO0;
                            if (cArr != null) {
                                c31909OooO0o0.ooOO(cArr);
                            }
                            ECPublicKey eCPublicKey3 = eCPublicKey2;
                            oO00000o.OooO0OO oooO0OOOooO00o = oO00000o.OooO0OO.OooO00o(eCPublicKey3);
                            int i = oooO0OOOooO00o.f113744OooOo.f113752OooO0O0 / 8;
                            InterfaceC34352OooO0O0 interfaceC34352OooO0O0 = C31909OooO0o0.f113771Oooo00O;
                            oO00000o.OooO0o oooO0o = oooO00o3.f113836OooOo0o;
                            C20519OooO0Oo.OooO0o0(4, interfaceC34352OooO0O0, "Performing key agreement with key in slot {} of type {}", oooO0o, oooO0OOOooO00o);
                            return c31909OooO0o0.Oooo0OO(oooO0o, oooO0OOOooO00o, ByteBuffer.allocate((i * 2) + 1).put((byte) 4).put(C31909OooO0o0.OooO0OO(i, eCPublicKey3.getW().getAffineX())).put(C31909OooO0o0.OooO0OO(i, eCPublicKey3.getW().getAffineY())).array(), true);
                        }
                    }));
                }
            });
            return (byte[]) ((C31906OooO0Oo) arrayBlockingQueue.take()).OooO0O0();
        }

        @Override // java.security.interfaces.ECKey
        public final ECParameterSpec getParams() {
            return this.f113839OooOoOO.getParams();
        }
    }

    public static class OooO0O0 extends OooOo implements RSAKey {

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final BigInteger f113840OooOoOO;

        public OooO0O0(oO00000o.OooO0o oooO0o, oO00000o.OooO0OO oooO0OO, BigInteger bigInteger, char[] cArr) {
            super(oooO0o, oooO0OO, cArr);
            this.f113840OooOoOO = bigInteger;
        }

        @Override // java.security.interfaces.RSAKey
        public final BigInteger getModulus() {
            return this.f113840OooOoOO;
        }
    }

    public OooOo(oO00000o.OooO0o oooO0o, oO00000o.OooO0OO oooO0OO, char[] cArr) {
        this.f113836OooOo0o = oooO0o;
        this.f113835OooOo = oooO0OO;
        this.f113838OooOoO0 = cArr != null ? Arrays.copyOf(cArr, cArr.length) : null;
    }

    public static OooOo OooO00o(PublicKey publicKey, oO00000o.OooO0o oooO0o, char[] cArr) {
        oO00000o.OooO0OO oooO0OOOooO00o = oO00000o.OooO0OO.OooO00o(publicKey);
        return oooO0OOOooO00o.f113744OooOo.f113751OooO00o == OooO0OO.OooO00o.f113747OooOo0o ? new OooO0O0(oooO0o, oooO0OOOooO00o, ((RSAPublicKey) publicKey).getModulus(), cArr) : new OooO00o(oooO0o, oooO0OOOooO00o, (ECPublicKey) publicKey, cArr);
    }

    public final byte[] OooO0O0(oO00000.OooO00o<oO00000.OooO00o<C31906OooO0Oo<C31909OooO0o0, Exception>>> oooO00o, final byte[] bArr) throws Exception {
        if (this.f113837OooOoO) {
            throw new IllegalStateException("PivPrivateKey has been destroyed");
        }
        final ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1);
        oooO00o.invoke(new oO00000.OooO00o() { // from class: oO0000O.OooOo00
            @Override // oO00000.OooO00o
            public final void invoke(Object obj) {
                final C31906OooO0Oo c31906OooO0Oo = (C31906OooO0Oo) obj;
                final OooOo oooOo = this.f113844OooO00o;
                oooOo.getClass();
                final byte[] bArr2 = bArr;
                arrayBlockingQueue.add(C31906OooO0Oo.OooO0OO(new Callable() { // from class: oO0000O.OooOo0
                    @Override // java.util.concurrent.Callable
                    public final Object call() throws com.yubico.yubikit.core.smartcard.OooO0O0, oO00000o.OooO0O0, IOException {
                        OooOo oooOo2 = oooOo;
                        oooOo2.getClass();
                        C31909OooO0o0 c31909OooO0o0 = (C31909OooO0o0) c31906OooO0Oo.OooO0O0();
                        char[] cArr = oooOo2.f113838OooOoO0;
                        if (cArr != null) {
                            c31909OooO0o0.ooOO(cArr);
                        }
                        oO00000o.OooO0OO oooO0OO = oooOo2.f113835OooOo;
                        OooO0OO.AbstractC20185OooO0OO abstractC20185OooO0OO = oooO0OO.f113744OooOo;
                        int i = abstractC20185OooO0OO.f113752OooO0O0 / 8;
                        byte[] bArrCopyOf = bArr2;
                        if (bArrCopyOf.length > i) {
                            if (abstractC20185OooO0OO.f113751OooO00o != OooO0OO.OooO00o.f113746OooOo) {
                                throw new IllegalArgumentException("Payload too large for key");
                            }
                            bArrCopyOf = Arrays.copyOf(bArrCopyOf, i);
                        } else if (bArrCopyOf.length < i) {
                            byte[] bArr3 = new byte[i];
                            System.arraycopy(bArrCopyOf, 0, bArr3, i - bArrCopyOf.length, bArrCopyOf.length);
                            bArrCopyOf = bArr3;
                        }
                        InterfaceC34352OooO0O0 interfaceC34352OooO0O0 = C31909OooO0o0.f113771Oooo00O;
                        oO00000o.OooO0o oooO0o = oooOo2.f113836OooOo0o;
                        C20519OooO0Oo.OooO0o0(4, interfaceC34352OooO0O0, "Decrypting data with key in slot {} of type {}", oooO0o, oooO0OO);
                        return c31909OooO0o0.Oooo0OO(oooO0o, oooO0OO, bArrCopyOf, false);
                    }
                }));
            }
        });
        return (byte[]) ((C31906OooO0Oo) arrayBlockingQueue.take()).OooO0O0();
    }

    @Override // javax.security.auth.Destroyable
    public final void destroy() {
        char[] cArr = this.f113838OooOoO0;
        if (cArr != null) {
            Arrays.fill(cArr, (char) 0);
        }
        this.f113837OooOoO = true;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.f113835OooOo.f113744OooOo.f113751OooO00o.name();
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        return null;
    }

    @Override // java.security.Key
    public final String getFormat() {
        return null;
    }

    @Override // javax.security.auth.Destroyable
    public final boolean isDestroyed() {
        return this.f113837OooOoO;
    }
}
