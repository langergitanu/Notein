package oO00O0oo;

import com.android.billingclient.api.C22189OoooO0;
import io.ktor.utils.p616io.C23992OoooooO;
import io.ktor.utils.p616io.InterfaceC23967Oooo00O;
import io.ktor.utils.p616io.o000OOo;
import java.io.Closeable;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SocketChannel;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import oO00O0oo.OooOo00;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O0OOo.C32654OooO0O0;
import oO0o0OO.o00000OO;

/* JADX INFO: renamed from: oO00O0oo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.network.sockets.CIOReaderKt$attachForReadingDirectImpl$1", m80623f = "CIOReader.kt", m80624l = {96, 108, 109, 96, 108, 109}, m80625m = "invokeSuspend")
public final class C32219OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<o000OOo, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f115624OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f115625OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Closeable f115626OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Closeable f115627OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public oO0O0OOo.OooOOO0 f115628OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public /* synthetic */ Object f115629OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f115630OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ oO0O0OOo.OooOO0O f115631OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final /* synthetic */ OooOo00.OooO0OO f115632OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final /* synthetic */ io.ktor.utils.p616io.OooO00o f115633Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final /* synthetic */ ReadableByteChannel f115634Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final /* synthetic */ C32654OooO0O0 f115635Oooo00o;

    /* JADX INFO: renamed from: oO00O0oo.OooO0o0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "io.ktor.network.sockets.CIOReaderKt$attachForReadingDirectImpl$1$timeout$1", m80623f = "CIOReader.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32507OooOO0o<Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.p616io.OooO00o f115636OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(io.ktor.utils.p616io.OooO00o oooO00o, Continuation continuation) {
            super(1, continuation);
            this.f115636OooOo0o = oooO00o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Continuation<?> continuation) {
            return new OooO00o(this.f115636OooOo0o, continuation);
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final Object invoke(Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            this.f115636OooOo0o.OooO0Oo(new SocketTimeoutException());
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32219OooO0o0(oO0O0OOo.OooOO0O oooOO0O, OooOo00.OooO0OO oooO0OO, io.ktor.utils.p616io.OooO00o oooO00o, ReadableByteChannel readableByteChannel, C32654OooO0O0 c32654OooO0O0, Continuation continuation) {
        super(2, continuation);
        this.f115631OooOooO = oooOO0O;
        this.f115632OooOooo = oooO0OO;
        this.f115633Oooo000 = oooO00o;
        this.f115634Oooo00O = readableByteChannel;
        this.f115635Oooo00o = c32654OooO0O0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        ReadableByteChannel readableByteChannel = this.f115634Oooo00O;
        C32219OooO0o0 c32219OooO0o0 = new C32219OooO0o0(this.f115631OooOooO, this.f115632OooOooo, this.f115633Oooo000, readableByteChannel, this.f115635Oooo00o, continuation);
        c32219OooO0o0.f115629OooOoo = obj;
        return c32219OooO0o0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(o000OOo o000ooo2, Continuation<? super C32460OooOooO> continuation) {
        return ((C32219OooO0o0) create(o000ooo2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x01bb, code lost:
    
        if (r15 != r0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01c4, code lost:
    
        if (((java.lang.Number) r15).intValue() != 0) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00eb A[Catch: all -> 0x0085, TryCatch #2 {all -> 0x0085, blocks: (B:85:0x01c8, B:38:0x00e5, B:40:0x00eb, B:42:0x00ef, B:46:0x0108, B:48:0x0110, B:50:0x0116, B:51:0x0119, B:57:0x013a, B:60:0x014f, B:54:0x0134, B:63:0x0158, B:89:0x01d4, B:91:0x01d8, B:92:0x01db, B:94:0x01e1, B:103:0x01fe, B:86:0x01ce, B:87:0x01d1, B:18:0x0080, B:23:0x009c, B:26:0x00b5, B:29:0x00c0, B:32:0x00ca, B:35:0x00d5, B:7:0x002e, B:82:0x01be, B:73:0x0186, B:79:0x01a8, B:76:0x01a3, B:84:0x01c6, B:64:0x015b, B:68:0x0175, B:70:0x017d, B:72:0x0183, B:12:0x004c, B:15:0x0067), top: B:116:0x000d, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0110 A[Catch: all -> 0x0085, TryCatch #2 {all -> 0x0085, blocks: (B:85:0x01c8, B:38:0x00e5, B:40:0x00eb, B:42:0x00ef, B:46:0x0108, B:48:0x0110, B:50:0x0116, B:51:0x0119, B:57:0x013a, B:60:0x014f, B:54:0x0134, B:63:0x0158, B:89:0x01d4, B:91:0x01d8, B:92:0x01db, B:94:0x01e1, B:103:0x01fe, B:86:0x01ce, B:87:0x01d1, B:18:0x0080, B:23:0x009c, B:26:0x00b5, B:29:0x00c0, B:32:0x00ca, B:35:0x00d5, B:7:0x002e, B:82:0x01be, B:73:0x0186, B:79:0x01a8, B:76:0x01a3, B:84:0x01c6, B:64:0x015b, B:68:0x0175, B:70:0x017d, B:72:0x0183, B:12:0x004c, B:15:0x0067), top: B:116:0x000d, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0134 A[Catch: all -> 0x0085, TryCatch #2 {all -> 0x0085, blocks: (B:85:0x01c8, B:38:0x00e5, B:40:0x00eb, B:42:0x00ef, B:46:0x0108, B:48:0x0110, B:50:0x0116, B:51:0x0119, B:57:0x013a, B:60:0x014f, B:54:0x0134, B:63:0x0158, B:89:0x01d4, B:91:0x01d8, B:92:0x01db, B:94:0x01e1, B:103:0x01fe, B:86:0x01ce, B:87:0x01d1, B:18:0x0080, B:23:0x009c, B:26:0x00b5, B:29:0x00c0, B:32:0x00ca, B:35:0x00d5, B:7:0x002e, B:82:0x01be, B:73:0x0186, B:79:0x01a8, B:76:0x01a3, B:84:0x01c6, B:64:0x015b, B:68:0x0175, B:70:0x017d, B:72:0x0183, B:12:0x004c, B:15:0x0067), top: B:116:0x000d, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013a A[Catch: all -> 0x0085, PHI: r1 r8 r9 r10 r11
      0x013a: PHI (r1v14 oO0O0OOo.OooOOO0) = (r1v7 oO0O0OOo.OooOOO0), (r1v15 oO0O0OOo.OooOOO0) binds: [B:23:0x009c, B:55:0x0136] A[DONT_GENERATE, DONT_INLINE]
      0x013a: PHI (r8v15 oO0O0OOo.OooOO0O) = (r8v6 oO0O0OOo.OooOO0O), (r8v16 oO0O0OOo.OooOO0O) binds: [B:23:0x009c, B:55:0x0136] A[DONT_GENERATE, DONT_INLINE]
      0x013a: PHI (r9v13 java.nio.channels.ReadableByteChannel) = (r9v4 java.nio.channels.ReadableByteChannel), (r9v14 java.nio.channels.ReadableByteChannel) binds: [B:23:0x009c, B:55:0x0136] A[DONT_GENERATE, DONT_INLINE]
      0x013a: PHI (r10v15 io.ktor.utils.io.Oooo00O) = (r10v6 io.ktor.utils.io.Oooo00O), (r10v16 io.ktor.utils.io.Oooo00O) binds: [B:23:0x009c, B:55:0x0136] A[DONT_GENERATE, DONT_INLINE]
      0x013a: PHI (r11v14 io.ktor.network.util.OooO0OO) = (r11v5 io.ktor.network.util.OooO0OO), (r11v15 io.ktor.network.util.OooO0OO) binds: [B:23:0x009c, B:55:0x0136] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {all -> 0x0085, blocks: (B:85:0x01c8, B:38:0x00e5, B:40:0x00eb, B:42:0x00ef, B:46:0x0108, B:48:0x0110, B:50:0x0116, B:51:0x0119, B:57:0x013a, B:60:0x014f, B:54:0x0134, B:63:0x0158, B:89:0x01d4, B:91:0x01d8, B:92:0x01db, B:94:0x01e1, B:103:0x01fe, B:86:0x01ce, B:87:0x01d1, B:18:0x0080, B:23:0x009c, B:26:0x00b5, B:29:0x00c0, B:32:0x00ca, B:35:0x00d5, B:7:0x002e, B:82:0x01be, B:73:0x0186, B:79:0x01a8, B:76:0x01a3, B:84:0x01c6, B:64:0x015b, B:68:0x0175, B:70:0x017d, B:72:0x0183, B:12:0x004c, B:15:0x0067), top: B:116:0x000d, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017d A[Catch: all -> 0x0033, TryCatch #1 {all -> 0x0033, blocks: (B:7:0x002e, B:82:0x01be, B:73:0x0186, B:79:0x01a8, B:76:0x01a3, B:84:0x01c6, B:64:0x015b, B:68:0x0175, B:70:0x017d, B:72:0x0183, B:12:0x004c, B:15:0x0067), top: B:116:0x000d, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0110 -> B:38:0x00e5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0114 -> B:38:0x00e5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0155 -> B:51:0x0119). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0157 -> B:38:0x00e5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x017d -> B:84:0x01c6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0181 -> B:84:0x01c6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x01bb -> B:82:0x01be). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws IOException {
        io.ktor.network.util.OooO0OO oooO0OOOooO00o;
        oO0O0OOo.OooOOO0 oooOOO0;
        oO0O0OOo.OooOO0O oooOO0O;
        ReadableByteChannel readableByteChannel;
        InterfaceC23967Oooo00O interfaceC23967Oooo00O;
        oO0O0OOo.OooOO0O oooOO0O2;
        ReadableByteChannel readableByteChannel2;
        InterfaceC23967Oooo00O interfaceC23967Oooo00O2;
        io.ktor.network.util.OooO0OO oooO0OO;
        int iIntValue;
        Object objO000Oo0;
        int iIntValue2;
        boolean z;
        o00000OO o00000oo2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f115630OooOoo0;
        ReadableByteChannel readableByteChannel3 = this.f115634Oooo00O;
        io.ktor.utils.p616io.OooO00o oooO00o = this.f115633Oooo000;
        oO0O0OOo.OooOO0O oooOO0O3 = this.f115631OooOooO;
        try {
            try {
                switch (i) {
                    case 0:
                        C32446OooOOOo.OooO0O0(obj);
                        o000OOo o000ooo2 = (o000OOo) this.f115629OooOoo;
                        oooOO0O3.Oooo00O(oO0O0OOo.OooOO0.READ, false);
                        OooOo00.OooO0OO oooO0OO2 = this.f115632OooOooo;
                        oooO0OOOooO00o = (oooO0OO2 != null ? new Long(oooO0OO2.f115684OooO0Oo) : null) != null ? C22189OoooO0.OooO00o(o000ooo2, "reading-direct", oooO0OO2.f115684OooO0Oo, new OooO00o(oooO00o, null)) : null;
                        if (!oooO00o.OoooO0()) {
                            oooOOO0 = this.f115635Oooo00o;
                            if (oooO0OOOooO00o == null) {
                                this.f115629OooOoo = oooO0OOOooO00o;
                                this.f115625OooOo0o = oooO00o;
                                this.f115624OooOo = readableByteChannel3;
                                this.f115627OooOoO0 = oooOO0O3;
                                this.f115626OooOoO = oooOOO0;
                                this.f115628OooOoOO = null;
                                this.f115630OooOoo0 = 1;
                                obj = C32220OooO0oO.OooO00o(oooO00o, readableByteChannel3, this);
                                if (obj != enumC32485OooO00o) {
                                    readableByteChannel = readableByteChannel3;
                                    interfaceC23967Oooo00O = oooO00o;
                                    oooOO0O = oooOO0O3;
                                    iIntValue2 = ((Number) obj).intValue();
                                    if (iIntValue2 == -1) {
                                        C23992OoooooO.OooO0O0(interfaceC23967Oooo00O);
                                    } else if (iIntValue2 <= 0) {
                                        interfaceC23967Oooo00O.flush();
                                        this.f115629OooOoo = oooO0OOOooO00o;
                                        this.f115625OooOo0o = interfaceC23967Oooo00O;
                                        this.f115624OooOo = readableByteChannel;
                                        this.f115627OooOoO0 = oooOO0O;
                                        this.f115626OooOoO = oooOOO0;
                                        this.f115630OooOoo0 = 2;
                                        oO0O0OOo.OooOO0 oooOO02 = oO0O0OOo.OooOO0.READ;
                                        oooOO0O.Oooo00O(oooOO02, true);
                                        objO000Oo0 = oooOOO0.o000Oo0(oooOO0O, oooOO02, this);
                                        if (objO000Oo0 == EnumC32485OooO00o.f116726OooOo0o) {
                                            objO000Oo0 = C32460OooOooO.f116667OooO00o;
                                        }
                                        if (objO000Oo0 == enumC32485OooO00o) {
                                            this.f115629OooOoo = oooO0OOOooO00o;
                                            this.f115625OooOo0o = interfaceC23967Oooo00O;
                                            this.f115624OooOo = readableByteChannel;
                                            this.f115627OooOoO0 = oooOO0O;
                                            this.f115626OooOoO = oooOOO0;
                                            this.f115630OooOoo0 = 3;
                                            obj = C32220OooO0oO.OooO00o(interfaceC23967Oooo00O, readableByteChannel, this);
                                            if (obj == enumC32485OooO00o) {
                                            }
                                            if (((Number) obj).intValue() != 0) {
                                            }
                                            this.f115629OooOoo = oooO0OOOooO00o;
                                            this.f115625OooOo0o = interfaceC23967Oooo00O;
                                            this.f115624OooOo = readableByteChannel;
                                            this.f115627OooOoO0 = oooOO0O;
                                            this.f115626OooOoO = oooOOO0;
                                            this.f115630OooOoo0 = 2;
                                            oO0O0OOo.OooOO0 oooOO022 = oO0O0OOo.OooOO0.READ;
                                            oooOO0O.Oooo00O(oooOO022, true);
                                            objO000Oo0 = oooOOO0.o000Oo0(oooOO0O, oooOO022, this);
                                            if (objO000Oo0 == EnumC32485OooO00o.f116726OooOo0o) {
                                            }
                                            if (objO000Oo0 == enumC32485OooO00o) {
                                            }
                                        }
                                    }
                                    if (!oooO00o.OoooO0()) {
                                        if (oooO0OOOooO00o != null && (o00000oo2 = oooO0OOOooO00o.f80488OooO0o0) != null) {
                                            o00000oo2.cancel((CancellationException) null);
                                        }
                                        Throwable thOooO0O0 = oooO00o.OooO0O0();
                                        if (thOooO0O0 != null) {
                                            throw thOooO0O0;
                                        }
                                        C23992OoooooO.OooO0O0(oooO00o);
                                        if (z) {
                                            try {
                                                if (OooOOO0.f115666OooO00o) {
                                                    ((SocketChannel) readableByteChannel3).shutdownInput();
                                                } else {
                                                    ((SocketChannel) readableByteChannel3).socket().shutdownInput();
                                                }
                                                break;
                                            } catch (ClosedChannelException unused) {
                                            }
                                        }
                                        return C32460OooOooO.f116667OooO00o;
                                    }
                                }
                            } else {
                                oooO0OOOooO00o.OooO00o();
                                this.f115629OooOoo = oooO0OOOooO00o;
                                this.f115625OooOo0o = oooO0OOOooO00o;
                                this.f115624OooOo = oooO00o;
                                this.f115627OooOoO0 = readableByteChannel3;
                                this.f115626OooOoO = oooOO0O3;
                                this.f115628OooOoOO = oooOOO0;
                                this.f115630OooOoo0 = 4;
                                obj = C32220OooO0oO.OooO00o(oooO00o, readableByteChannel3, this);
                                if (obj != enumC32485OooO00o) {
                                    readableByteChannel2 = readableByteChannel3;
                                    interfaceC23967Oooo00O2 = oooO00o;
                                    oooOO0O2 = oooOO0O3;
                                    oooO0OO = oooO0OOOooO00o;
                                    iIntValue = ((Number) obj).intValue();
                                    if (iIntValue == -1) {
                                        C23992OoooooO.OooO0O0(interfaceC23967Oooo00O2);
                                    } else if (iIntValue <= 0) {
                                        interfaceC23967Oooo00O2.flush();
                                        this.f115629OooOoo = oooO0OO;
                                        this.f115625OooOo0o = oooO0OOOooO00o;
                                        this.f115624OooOo = interfaceC23967Oooo00O2;
                                        this.f115627OooOoO0 = readableByteChannel2;
                                        this.f115626OooOoO = oooOO0O2;
                                        this.f115628OooOoOO = oooOOO0;
                                        this.f115630OooOoo0 = 5;
                                        oO0O0OOo.OooOO0 oooOO03 = oO0O0OOo.OooOO0.READ;
                                        oooOO0O2.Oooo00O(oooOO03, true);
                                        Object objO000Oo02 = oooOOO0.o000Oo0(oooOO0O2, oooOO03, this);
                                        if (objO000Oo02 != EnumC32485OooO00o.f116726OooOo0o) {
                                            objO000Oo02 = C32460OooOooO.f116667OooO00o;
                                        }
                                        if (objO000Oo02 != enumC32485OooO00o) {
                                            this.f115629OooOoo = oooO0OO;
                                            this.f115625OooOo0o = oooO0OOOooO00o;
                                            this.f115624OooOo = interfaceC23967Oooo00O2;
                                            this.f115627OooOoO0 = readableByteChannel2;
                                            this.f115626OooOoO = oooOO0O2;
                                            this.f115628OooOoOO = oooOOO0;
                                            this.f115630OooOoo0 = 6;
                                            obj = C32220OooO0oO.OooO00o(interfaceC23967Oooo00O2, readableByteChannel2, this);
                                            break;
                                        }
                                    }
                                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                                    oooO0OOOooO00o.OooO0O0();
                                    oooO0OOOooO00o = oooO0OO;
                                    if (!oooO00o.OoooO0()) {
                                    }
                                }
                            }
                            return enumC32485OooO00o;
                        }
                        break;
                    case 1:
                        oooOOO0 = (oO0O0OOo.OooOOO0) this.f115626OooOoO;
                        oooOO0O = (oO0O0OOo.OooOO0O) this.f115627OooOoO0;
                        readableByteChannel = (ReadableByteChannel) this.f115624OooOo;
                        interfaceC23967Oooo00O = (InterfaceC23967Oooo00O) this.f115625OooOo0o;
                        oooO0OOOooO00o = (io.ktor.network.util.OooO0OO) this.f115629OooOoo;
                        C32446OooOOOo.OooO0O0(obj);
                        iIntValue2 = ((Number) obj).intValue();
                        if (iIntValue2 == -1) {
                        }
                        if (!oooO00o.OoooO0()) {
                        }
                        break;
                    case 2:
                        oooOOO0 = (oO0O0OOo.OooOOO0) this.f115626OooOoO;
                        oooOO0O = (oO0O0OOo.OooOO0O) this.f115627OooOoO0;
                        readableByteChannel = (ReadableByteChannel) this.f115624OooOo;
                        interfaceC23967Oooo00O = (InterfaceC23967Oooo00O) this.f115625OooOo0o;
                        oooO0OOOooO00o = (io.ktor.network.util.OooO0OO) this.f115629OooOoo;
                        C32446OooOOOo.OooO0O0(obj);
                        this.f115629OooOoo = oooO0OOOooO00o;
                        this.f115625OooOo0o = interfaceC23967Oooo00O;
                        this.f115624OooOo = readableByteChannel;
                        this.f115627OooOoO0 = oooOO0O;
                        this.f115626OooOoO = oooOOO0;
                        this.f115630OooOoo0 = 3;
                        obj = C32220OooO0oO.OooO00o(interfaceC23967Oooo00O, readableByteChannel, this);
                        if (obj == enumC32485OooO00o) {
                        }
                        if (((Number) obj).intValue() != 0) {
                        }
                        this.f115629OooOoo = oooO0OOOooO00o;
                        this.f115625OooOo0o = interfaceC23967Oooo00O;
                        this.f115624OooOo = readableByteChannel;
                        this.f115627OooOoO0 = oooOO0O;
                        this.f115626OooOoO = oooOOO0;
                        this.f115630OooOoo0 = 2;
                        oO0O0OOo.OooOO0 oooOO0222 = oO0O0OOo.OooOO0.READ;
                        oooOO0O.Oooo00O(oooOO0222, true);
                        objO000Oo0 = oooOOO0.o000Oo0(oooOO0O, oooOO0222, this);
                        if (objO000Oo0 == EnumC32485OooO00o.f116726OooOo0o) {
                        }
                        if (objO000Oo0 == enumC32485OooO00o) {
                        }
                        return enumC32485OooO00o;
                    case 3:
                        oooOOO0 = (oO0O0OOo.OooOOO0) this.f115626OooOoO;
                        oooOO0O = (oO0O0OOo.OooOO0O) this.f115627OooOoO0;
                        readableByteChannel = (ReadableByteChannel) this.f115624OooOo;
                        interfaceC23967Oooo00O = (InterfaceC23967Oooo00O) this.f115625OooOo0o;
                        oooO0OOOooO00o = (io.ktor.network.util.OooO0OO) this.f115629OooOoo;
                        C32446OooOOOo.OooO0O0(obj);
                        if (((Number) obj).intValue() != 0) {
                        }
                        this.f115629OooOoo = oooO0OOOooO00o;
                        this.f115625OooOo0o = interfaceC23967Oooo00O;
                        this.f115624OooOo = readableByteChannel;
                        this.f115627OooOoO0 = oooOO0O;
                        this.f115626OooOoO = oooOOO0;
                        this.f115630OooOoo0 = 2;
                        oO0O0OOo.OooOO0 oooOO02222 = oO0O0OOo.OooOO0.READ;
                        oooOO0O.Oooo00O(oooOO02222, true);
                        objO000Oo0 = oooOOO0.o000Oo0(oooOO0O, oooOO02222, this);
                        if (objO000Oo0 == EnumC32485OooO00o.f116726OooOo0o) {
                        }
                        if (objO000Oo0 == enumC32485OooO00o) {
                        }
                        return enumC32485OooO00o;
                    case 4:
                        oooOOO0 = this.f115628OooOoOO;
                        oooOO0O2 = (oO0O0OOo.OooOO0O) this.f115626OooOoO;
                        readableByteChannel2 = (ReadableByteChannel) this.f115627OooOoO0;
                        interfaceC23967Oooo00O2 = (InterfaceC23967Oooo00O) this.f115624OooOo;
                        oooO0OOOooO00o = (io.ktor.network.util.OooO0OO) this.f115625OooOo0o;
                        oooO0OO = (io.ktor.network.util.OooO0OO) this.f115629OooOoo;
                        C32446OooOOOo.OooO0O0(obj);
                        iIntValue = ((Number) obj).intValue();
                        if (iIntValue == -1) {
                        }
                        C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                        oooO0OOOooO00o.OooO0O0();
                        oooO0OOOooO00o = oooO0OO;
                        if (!oooO00o.OoooO0()) {
                        }
                        break;
                    case 5:
                        oooOOO0 = this.f115628OooOoOO;
                        oooOO0O2 = (oO0O0OOo.OooOO0O) this.f115626OooOoO;
                        readableByteChannel2 = (ReadableByteChannel) this.f115627OooOoO0;
                        interfaceC23967Oooo00O2 = (InterfaceC23967Oooo00O) this.f115624OooOo;
                        oooO0OOOooO00o = (io.ktor.network.util.OooO0OO) this.f115625OooOo0o;
                        oooO0OO = (io.ktor.network.util.OooO0OO) this.f115629OooOoo;
                        C32446OooOOOo.OooO0O0(obj);
                        this.f115629OooOoo = oooO0OO;
                        this.f115625OooOo0o = oooO0OOOooO00o;
                        this.f115624OooOo = interfaceC23967Oooo00O2;
                        this.f115627OooOoO0 = readableByteChannel2;
                        this.f115626OooOoO = oooOO0O2;
                        this.f115628OooOoOO = oooOOO0;
                        this.f115630OooOoo0 = 6;
                        obj = C32220OooO0oO.OooO00o(interfaceC23967Oooo00O2, readableByteChannel2, this);
                        break;
                    case 6:
                        oooOOO0 = this.f115628OooOoOO;
                        oooOO0O2 = (oO0O0OOo.OooOO0O) this.f115626OooOoO;
                        readableByteChannel2 = (ReadableByteChannel) this.f115627OooOoO0;
                        interfaceC23967Oooo00O2 = (InterfaceC23967Oooo00O) this.f115624OooOo;
                        oooO0OOOooO00o = (io.ktor.network.util.OooO0OO) this.f115625OooOo0o;
                        oooO0OO = (io.ktor.network.util.OooO0OO) this.f115629OooOoo;
                        C32446OooOOOo.OooO0O0(obj);
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Throwable th) {
                oooO0OOOooO00o.OooO0O0();
                throw th;
            }
        } finally {
            if (readableByteChannel3 instanceof SocketChannel) {
                try {
                    if (OooOOO0.f115666OooO00o) {
                        ((SocketChannel) readableByteChannel3).shutdownInput();
                    } else {
                        ((SocketChannel) readableByteChannel3).socket().shutdownInput();
                    }
                } catch (ClosedChannelException unused2) {
                }
            }
        }
    }
}
