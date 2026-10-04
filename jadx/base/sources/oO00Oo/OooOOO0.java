package oO00Oo;

import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.huawei.hms.network.embedded.C18177fb;
import com.orion.notein.data.service.dto.MaterialPurchaseStatusResponse;
import io.ktor.utils.p616io.InterfaceC23986Ooooo0o;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.atomic.AtomicReference;
import o0oOOoOO.C30847OooO0Oo;
import oO00Oo.AbstractC32252OooO0O0;
import oO00Oo.C32254OooO0OO;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33635Oooo00O;
import oO0o0OO.EnumC33637Oooo0O0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OOo.C33695OooO0o0;
import oO0o0OOo.C33703OooOOO0;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOOO0 implements InterfaceC33636Oooo00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final InterfaceC34415OooO0oo f115895OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC23986Ooooo0o f115896OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public OooO00o f115897OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public long f115898OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final C32254OooO0OO f115899OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C33695OooO0o0 f115900OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C32260OooOO0o f115901OooOoo0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO00o f115902OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f115903OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final /* synthetic */ OooO00o[] f115904OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final OooO00o f115905OooOoO0;

        static {
            OooO00o oooO00o = new OooO00o("HEADER", 0);
            f115903OooOo0o = oooO00o;
            OooO00o oooO00o2 = new OooO00o("BODY", 1);
            f115902OooOo = oooO00o2;
            OooO00o oooO00o3 = new OooO00o(MaterialPurchaseStatusResponse.STATUS_CLOSED, 2);
            f115905OooOoO0 = oooO00o3;
            f115904OooOoO = new OooO00o[]{oooO00o, oooO00o2, oooO00o3};
        }

        public OooO00o() {
            throw null;
        }

        public static OooO00o valueOf(String str) {
            return (OooO00o) Enum.valueOf(OooO00o.class, str);
        }

        public static OooO00o[] values() {
            return (OooO00o[]) f115904OooOoO.clone();
        }
    }

    public OooOOO0(InterfaceC23986Ooooo0o byteChannel, InterfaceC34415OooO0oo coroutineContext, oO00Oo0o.OooO0o oooO0o) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(byteChannel, "byteChannel");
        kotlin.jvm.internal.OooOOO0.OooO0oO(coroutineContext, "coroutineContext");
        this.f115896OooOo0o = byteChannel;
        this.f115895OooOo = coroutineContext;
        this.f115898OooOoO0 = 2147483647L;
        this.f115897OooOoO = OooO00o.f115903OooOo0o;
        this.f115899OooOoOO = new C32254OooO0OO();
        this.f115901OooOoo0 = new C32260OooOO0o();
        this.f115900OooOoo = C33703OooOOO0.OooO00o(8, 6, null);
        C33609OooO0oo.OooO0O0(this, new C33635Oooo00O("ws-reader"), EnumC33637Oooo0O0.f121319OooOoO0, new C32263OooOOo0(oooO0o, this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007b, code lost:
    
        if (r8.OooO0Oo(r7, r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x007b -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO00o(OooOOO0 oooOOO0, ByteBuffer byteBuffer, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C32261OooOOOo c32261OooOOOo;
        OooOOO0 oooOOO02;
        ByteBuffer byteBuffer2;
        oooOOO0.getClass();
        if (abstractC32479OooO0OO instanceof C32261OooOOOo) {
            c32261OooOOOo = (C32261OooOOOo) abstractC32479OooO0OO;
            int i = c32261OooOOOo.f115915OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32261OooOOOo.f115915OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c32261OooOOOo = new C32261OooOOOo(oooOOO0, abstractC32479OooO0OO);
            }
        }
        Object objOooO0oO = c32261OooOOOo.f115914OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c32261OooOOOo.f115915OooOoOO;
        OooO00o oooO00o = OooO00o.f115905OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0oO);
            byteBuffer.clear();
            if (oooOOO0.f115897OooOoO != oooO00o) {
            }
            return C32460OooOooO.f116667OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteBuffer2 = c32261OooOOOo.f115911OooOo;
            oooOOO02 = c32261OooOOOo.f115912OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0oO);
            OooOOO0 oooOOO03 = oooOOO02;
            byteBuffer = byteBuffer2;
            oooOOO0 = oooOOO03;
            byteBuffer.compact();
            if (oooOOO0.f115897OooOoO != oooO00o) {
                c32261OooOOOo.f115912OooOo0o = oooOOO0;
                c32261OooOOOo.f115911OooOo = byteBuffer;
                c32261OooOOOo.f115915OooOoOO = 1;
                objOooO0oO = oooOOO0.f115896OooOo0o.OooO0oO(byteBuffer, c32261OooOOOo);
                if (objOooO0oO != enumC32485OooO00o) {
                    ByteBuffer byteBuffer3 = byteBuffer;
                    oooOOO02 = oooOOO0;
                    byteBuffer2 = byteBuffer3;
                    if (((Number) objOooO0oO).intValue() != -1) {
                        oooOOO02.f115897OooOoO = oooO00o;
                    } else {
                        byteBuffer2.flip();
                        c32261OooOOOo.f115912OooOo0o = oooOOO02;
                        c32261OooOOOo.f115911OooOo = byteBuffer2;
                        c32261OooOOOo.f115915OooOoOO = 2;
                    }
                }
                return enumC32485OooO00o;
            }
            return C32460OooOooO.f116667OooO00o;
        }
        byteBuffer2 = c32261OooOOOo.f115911OooOo;
        oooOOO02 = c32261OooOOOo.f115912OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO0oO);
        if (((Number) objOooO0oO).intValue() != -1) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00f8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooOOO oooOOO;
        Object oooO0o0;
        Object c20211OooO0O0;
        C33695OooO0o0 c33695OooO0o0;
        OooOOO0 oooOOO0;
        if (abstractC32479OooO0OO instanceof OooOOO) {
            oooOOO = (OooOOO) abstractC32479OooO0OO;
            int i = oooOOO.f115893OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOOO.f115893OooOoO = i - Integer.MIN_VALUE;
            } else {
                oooOOO = new OooOOO(this, abstractC32479OooO0OO);
            }
        }
        Object obj = oooOOO.f115891OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooOOO.f115893OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C32260OooOO0o c32260OooOO0o = this.f115901OooOoo0;
            if (c32260OooOO0o.f115888OooO00o <= 0) {
                C32254OooO0OO c32254OooO0OO = this.f115899OooOoOO;
                this.f115897OooOoO = c32254OooO0OO.OooO00o() == EnumC32257OooO0o0.f115867OooOoo ? OooO00o.f115905OooOoO0 : OooO00o.f115903OooOo0o;
                boolean z = c32254OooO0OO.f115848OooO0O0;
                EnumC32257OooO0o0 enumC32257OooO0o0OooO00o = c32254OooO0OO.OooO00o();
                Integer num = c32254OooO0OO.f115856OooOO0O;
                ByteBuffer byteBuffer = c32260OooOO0o.f115889OooO0O0;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(byteBuffer);
                byteBuffer.flip();
                ByteBuffer view = byteBuffer.slice();
                if (num != null) {
                    ByteBuffer byteBuffer2 = c32260OooOO0o.f115890OooO0OO;
                    byteBuffer2.clear();
                    byteBuffer2.asIntBuffer().put(num.intValue());
                    byteBuffer2.clear();
                    kotlin.jvm.internal.OooOOO0.OooO0o(view, "view");
                    C30847OooO0Oo.OooO0o(view, byteBuffer2);
                }
                c32260OooOO0o.f115889OooO0O0 = null;
                ByteBuffer byteBufferAsReadOnlyBuffer = view.asReadOnlyBuffer();
                kotlin.jvm.internal.OooOOO0.OooO0o(byteBufferAsReadOnlyBuffer, "buffer!!.run {\n        f….asReadOnlyBuffer()\n    }");
                byte[] bArr = new byte[byteBufferAsReadOnlyBuffer.remaining()];
                byteBufferAsReadOnlyBuffer.get(bArr);
                boolean z2 = c32254OooO0OO.f115849OooO0OO;
                boolean z3 = c32254OooO0OO.f115850OooO0Oo;
                boolean z4 = c32254OooO0OO.f115852OooO0o0;
                int iOrdinal = enumC32257OooO0o0OooO00o.ordinal();
                if (iOrdinal == 0) {
                    oooO0o0 = new AbstractC32252OooO0O0.OooO0o0(z, EnumC32257OooO0o0.f115866OooOoOO, bArr, z2, z3, z4);
                } else if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        c20211OooO0O0 = new AbstractC32252OooO0O0.C20211OooO0O0(bArr);
                    } else if (iOrdinal == 3) {
                        c20211OooO0O0 = new AbstractC32252OooO0O0.OooO0OO(true, EnumC32257OooO0o0.f115869OooOooO, bArr, false, false, false);
                    } else {
                        if (iOrdinal != 4) {
                            throw new C32442OooOO0o();
                        }
                        c20211OooO0O0 = new AbstractC32252OooO0O0.C32253OooO0Oo(true, EnumC32257OooO0o0.f115870OooOooo, bArr, false, false, false);
                    }
                    c33695OooO0o0 = this.f115900OooOoo;
                    oooOOO.f115892OooOo0o = this;
                    oooOOO.f115893OooOoO = 1;
                    if (c33695OooO0o0.OooOOO(c20211OooO0O0, oooOOO) != enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                    oooOOO0 = this;
                } else {
                    oooO0o0 = new AbstractC32252OooO0O0.OooO00o(z, EnumC32257OooO0o0.f115868OooOoo0, bArr, z2, z3, z4);
                }
                c20211OooO0O0 = oooO0o0;
                c33695OooO0o0 = this.f115900OooOoo;
                oooOOO.f115892OooOo0o = this;
                oooOOO.f115893OooOoO = 1;
                if (c33695OooO0o0.OooOOO(c20211OooO0O0, oooOOO) != enumC32485OooO00o) {
                }
            }
            return C32460OooOooO.f116667OooO00o;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        oooOOO0 = oooOOO.f115892OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C32254OooO0OO c32254OooO0OO2 = oooOOO0.f115899OooOoOO;
        AtomicReference<C32254OooO0OO.OooO00o> atomicReference = c32254OooO0OO2.f115847OooO00o;
        C32254OooO0OO.OooO00o oooO00o = C32254OooO0OO.OooO00o.f115859OooOoO;
        C32254OooO0OO.OooO00o oooO00o2 = C32254OooO0OO.OooO00o.f115858OooOo0o;
        while (!atomicReference.compareAndSet(oooO00o, oooO00o2)) {
            if (atomicReference.get() != oooO00o) {
                throw new IllegalStateException("It should be state BODY but it is " + atomicReference.get());
            }
        }
        c32254OooO0OO2.f115853OooO0oO = 0;
        c32254OooO0OO2.f115855OooOO0 = 0L;
        c32254OooO0OO2.f115846OooO = 0;
        c32254OooO0OO2.f115856OooOO0O = null;
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00fc, code lost:
    
        if (r9.get() != r12) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00fe, code lost:
    
        r7.f115897OooOoO = oO00Oo.OooOOO0.OooO00o.f115902OooOo;
        r9 = r4.f115855OooOO0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0109, code lost:
    
        if (r9 > 2147483647L) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x010f, code lost:
    
        if (r9 > r7.f115898OooOoO0) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0111, code lost:
    
        r4 = (int) r9;
        r8.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0117, code lost:
    
        if (r8.f115888OooO00o != 0) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0119, code lost:
    
        r8.f115888OooO00o = r4;
        r9 = r8.f115889OooO0O0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x011d, code lost:
    
        if (r9 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0123, code lost:
    
        if (r9.capacity() >= r4) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0125, code lost:
    
        r8.f115889OooO0O0 = java.nio.ByteBuffer.allocate(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x012b, code lost:
    
        r4 = r8.f115889OooO0O0;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(r4);
        r4.clear();
        r4 = r8.f115888OooO00o;
        r9 = r8.f115889OooO0O0;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(r9);
        r8.f115888OooO00o = r4 - io.ktor.utils.p616io.internal.OooOOO0.OooO0O0(r0, r9, r8.f115888OooO00o);
        r1.f115907OooOo0o = r7;
        r1.f115906OooOo = r0;
        r1.f115910OooOoOO = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x014d, code lost:
    
        if (r7.OooO0O0(r1) != r3) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0157, code lost:
    
        throw new java.lang.IllegalStateException("remaining should be 0");
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x015f, code lost:
    
        throw new oO00Oo.C32255OooO0Oo(r4.f115855OooOO0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0162, code lost:
    
        return oO00ooO.C32460OooOooO.f116667OooO00o;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0Oo(ByteBuffer byteBuffer, AbstractC32479OooO0OO abstractC32479OooO0OO) throws C32256OooO0o, C32255OooO0Oo {
        OooOOOO oooOOOO;
        OooOOO0 oooOOO0;
        ByteBuffer byteBuffer2;
        OooOOO0 oooOOO02;
        long j;
        if (abstractC32479OooO0OO instanceof OooOOOO) {
            oooOOOO = (OooOOOO) abstractC32479OooO0OO;
            int i = oooOOOO.f115910OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOOOO.f115910OooOoOO = i - Integer.MIN_VALUE;
                oooOOO0 = this;
            } else {
                oooOOO0 = this;
                oooOOOO = new OooOOOO(oooOOO0, abstractC32479OooO0OO);
            }
        }
        Object obj = oooOOOO.f115909OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooOOOO.f115910OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            byteBuffer2 = byteBuffer;
            oooOOO02 = oooOOO0;
        } else {
            if (i2 != 1 && i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ByteBuffer byteBuffer3 = oooOOOO.f115906OooOo;
            oooOOO02 = oooOOOO.f115907OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            byteBuffer2 = byteBuffer3;
        }
        while (byteBuffer2.hasRemaining()) {
            int iOrdinal = oooOOO02.f115897OooOoO.ordinal();
            C32260OooOO0o c32260OooOO0o = oooOOO02.f115901OooOoo0;
            if (iOrdinal == 0) {
                C32254OooO0OO c32254OooO0OO = oooOOO02.f115899OooOoOO;
                c32254OooO0OO.getClass();
                if (!kotlin.jvm.internal.OooOOO0.OooO0O0(byteBuffer2.order(), ByteOrder.BIG_ENDIAN)) {
                    throw new IllegalArgumentException(("Buffer order should be BIG_ENDIAN but it is " + byteBuffer2.order()).toString());
                }
                while (true) {
                    AtomicReference<C32254OooO0OO.OooO00o> atomicReference = c32254OooO0OO.f115847OooO00o;
                    C32254OooO0OO.OooO00o oooO00o = atomicReference.get();
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(oooO00o);
                    int iOrdinal2 = oooO00o.ordinal();
                    C32254OooO0OO.OooO00o oooO00o2 = C32254OooO0OO.OooO00o.f115860OooOoO0;
                    C32254OooO0OO.OooO00o oooO00o3 = C32254OooO0OO.OooO00o.f115859OooOoO;
                    int i3 = 8;
                    if (iOrdinal2 != 0) {
                        if (iOrdinal2 == 1) {
                            int iRemaining = byteBuffer2.remaining();
                            int i4 = c32254OooO0OO.f115846OooO;
                            if (iRemaining < i4) {
                                break;
                            }
                            if (i4 == 2) {
                                j = ((long) byteBuffer2.getShort()) & C18177fb.f54859s;
                            } else {
                                if (i4 != 8) {
                                    throw new IllegalStateException();
                                }
                                j = byteBuffer2.getLong();
                            }
                            c32254OooO0OO.f115855OooOO0 = j;
                            if (!c32254OooO0OO.f115851OooO0o) {
                                oooO00o2 = oooO00o3;
                            }
                            atomicReference.set(oooO00o2);
                        } else if (iOrdinal2 != 2) {
                            if (iOrdinal2 != 3) {
                                throw new C32442OooOO0o();
                            }
                        } else {
                            if (byteBuffer2.remaining() < 4) {
                                break;
                            }
                            c32254OooO0OO.f115856OooOO0O = Integer.valueOf(byteBuffer2.getInt());
                            atomicReference.set(oooO00o3);
                        }
                    } else {
                        if (byteBuffer2.remaining() < 2) {
                            break;
                        }
                        byte b = byteBuffer2.get();
                        byte b2 = byteBuffer2.get();
                        c32254OooO0OO.f115848OooO0O0 = (b & UnsignedBytes.MAX_POWER_OF_TWO) != 0;
                        c32254OooO0OO.f115849OooO0OO = (b & SignedBytes.MAX_POWER_OF_TWO) != 0;
                        c32254OooO0OO.f115850OooO0Oo = (b & 32) != 0;
                        c32254OooO0OO.f115852OooO0o0 = (b & 16) != 0;
                        int i5 = b & 15;
                        c32254OooO0OO.f115853OooO0oO = i5;
                        if (i5 == 0 && c32254OooO0OO.f115854OooO0oo == 0) {
                            throw new C32256OooO0o("Can't continue finished frames");
                        }
                        if (i5 == 0) {
                            c32254OooO0OO.f115853OooO0oO = c32254OooO0OO.f115854OooO0oo;
                        } else if (c32254OooO0OO.f115854OooO0oo != 0 && !c32254OooO0OO.OooO00o().f115873OooOo0o) {
                            throw new C32256OooO0o("Can't start new data frame before finishing previous one");
                        }
                        if (!c32254OooO0OO.OooO00o().f115873OooOo0o) {
                            c32254OooO0OO.f115854OooO0oo = c32254OooO0OO.f115848OooO0O0 ? 0 : c32254OooO0OO.f115853OooO0oO;
                        } else if (!c32254OooO0OO.f115848OooO0O0) {
                            throw new C32256OooO0o("control frames can't be fragmented");
                        }
                        c32254OooO0OO.f115851OooO0o = (b2 & UnsignedBytes.MAX_POWER_OF_TWO) != 0;
                        int i6 = b2 & Ascii.DEL;
                        if (c32254OooO0OO.OooO00o().f115873OooOo0o && i6 > 125) {
                            throw new C32256OooO0o("control frames can't be larger than 125 bytes");
                        }
                        if (i6 == 126) {
                            i3 = 2;
                        } else if (i6 != 127) {
                            i3 = 0;
                        }
                        c32254OooO0OO.f115846OooO = i3;
                        c32254OooO0OO.f115855OooOO0 = i3 == 0 ? i6 : 0L;
                        if (i3 > 0) {
                            atomicReference.set(C32254OooO0OO.OooO00o.f115857OooOo);
                        } else if (c32254OooO0OO.f115851OooO0o) {
                            atomicReference.set(oooO00o2);
                        } else {
                            atomicReference.set(oooO00o3);
                        }
                    }
                }
            } else if (iOrdinal == 1) {
                int i7 = c32260OooOO0o.f115888OooO00o;
                ByteBuffer byteBuffer4 = c32260OooOO0o.f115889OooO0O0;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(byteBuffer4);
                c32260OooOO0o.f115888OooO00o = i7 - io.ktor.utils.p616io.internal.OooOOO0.OooO0O0(byteBuffer2, byteBuffer4, c32260OooOO0o.f115888OooO00o);
                oooOOOO.f115907OooOo0o = oooOOO02;
                oooOOOO.f115906OooOo = byteBuffer2;
                oooOOOO.f115910OooOoOO = 2;
                if (oooOOO02.OooO0O0(oooOOOO) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else if (iOrdinal == 2) {
                return C32460OooOooO.f116667OooO00o;
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }

    @Override // oO0o0OO.InterfaceC33636Oooo00o
    public final InterfaceC34415OooO0oo OooOOO0() {
        return this.f115895OooOo;
    }
}
