package oO00O0oo;

import io.ktor.utils.p616io.o0OO00O;
import io.ktor.utils.p616io.o0ooOOo;
import java.io.Closeable;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.SocketChannel;
import java.nio.channels.WritableByteChannel;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24033OooOooo;
import oO00O0oo.OooOo00;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O0OOo.C32654OooO0O0;

/* JADX INFO: renamed from: oO00O0oo.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.network.sockets.CIOWriterKt$attachForWritingDirectImpl$1", m80623f = "CIOWriter.kt", m80624l = {86}, m80625m = "invokeSuspend")
public final class C32221OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<o0OO00O, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f115637OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f115638OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ io.ktor.utils.p616io.OooO00o f115639OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ oO0O0OOo.OooOO0O f115640OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ WritableByteChannel f115641OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ C32654OooO0O0 f115642OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ OooOo00.OooO0OO f115643OooOoo0;

    /* JADX INFO: renamed from: oO00O0oo.OooO0oo$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "io.ktor.network.sockets.CIOWriterKt$attachForWritingDirectImpl$1$1", m80623f = "CIOWriter.kt", m80624l = {98, 110, 110}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<o0ooOOo, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public ByteBuffer f115644OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public io.ktor.network.util.OooO0OO f115645OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public Object f115646OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public C24033OooOooo f115647OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public Closeable f115648OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public oO0O0OOo.OooOOO0 f115649OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public Closeable f115650OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public int f115651OooOooO;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public /* synthetic */ Object f115652OooOooo;

        /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
        public final /* synthetic */ WritableByteChannel f115653Oooo0;

        /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
        public final /* synthetic */ OooOo00.OooO0OO f115654Oooo000;

        /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
        public final /* synthetic */ o0OO00O f115655Oooo00O;

        /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.p616io.OooO00o f115656Oooo00o;

        /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
        public final /* synthetic */ oO0O0OOo.OooOO0O f115657Oooo0O0;

        /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
        public final /* synthetic */ C32654OooO0O0 f115658Oooo0OO;

        /* JADX INFO: renamed from: oO00O0oo.OooO0oo$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "io.ktor.network.sockets.CIOWriterKt$attachForWritingDirectImpl$1$1$timeout$1", m80623f = "CIOWriter.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C20205OooO00o extends AbstractC32476OooO implements InterfaceC32507OooOO0o<Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ io.ktor.utils.p616io.OooO00o f115659OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20205OooO00o(io.ktor.utils.p616io.OooO00o oooO00o, Continuation continuation) {
                super(1, continuation);
                this.f115659OooOo0o = oooO00o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Continuation<?> continuation) {
                return new C20205OooO00o(this.f115659OooOo0o, continuation);
            }

            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Continuation<? super C32460OooOooO> continuation) {
                return ((C20205OooO00o) create(continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                this.f115659OooOo0o.OooO0Oo(new SocketTimeoutException());
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(OooOo00.OooO0OO oooO0OO, o0OO00O o0oo00o2, io.ktor.utils.p616io.OooO00o oooO00o, WritableByteChannel writableByteChannel, oO0O0OOo.OooOO0O oooOO0O, C32654OooO0O0 c32654OooO0O0, Continuation continuation) {
            super(2, continuation);
            this.f115654Oooo000 = oooO0OO;
            this.f115655Oooo00O = o0oo00o2;
            this.f115656Oooo00o = oooO00o;
            this.f115653Oooo0 = writableByteChannel;
            this.f115657Oooo0O0 = oooOO0O;
            this.f115658Oooo0OO = c32654OooO0O0;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f115654Oooo000, this.f115655Oooo00O, this.f115656Oooo00o, this.f115653Oooo0, this.f115657Oooo0O0, this.f115658Oooo0OO, continuation);
            oooO00o.f115652OooOooo = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(o0ooOOo o0ooooo2, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(o0ooooo2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00c3  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00e1  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0109  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x008b -> B:39:0x00bd). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00ad -> B:24:0x0087). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0107 -> B:44:0x00d9). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x011e -> B:60:0x0141). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x013e -> B:60:0x0141). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 351
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: oO00O0oo.C32221OooO0oo.OooO00o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32221OooO0oo(oO0O0OOo.OooOO0O oooOO0O, io.ktor.utils.p616io.OooO00o oooO00o, WritableByteChannel writableByteChannel, OooOo00.OooO0OO oooO0OO, C32654OooO0O0 c32654OooO0O0, Continuation continuation) {
        super(2, continuation);
        this.f115640OooOoO0 = oooOO0O;
        this.f115639OooOoO = oooO00o;
        this.f115641OooOoOO = writableByteChannel;
        this.f115643OooOoo0 = oooO0OO;
        this.f115642OooOoo = c32654OooO0O0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C32221OooO0oo c32221OooO0oo = new C32221OooO0oo(this.f115640OooOoO0, this.f115639OooOoO, this.f115641OooOoOO, this.f115643OooOoo0, this.f115642OooOoo, continuation);
        c32221OooO0oo.f115637OooOo = obj;
        return c32221OooO0oo;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(o0OO00O o0oo00o2, Continuation<? super C32460OooOooO> continuation) {
        return ((C32221OooO0oo) create(o0oo00o2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws IOException {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f115638OooOo0o;
        WritableByteChannel writableByteChannel = this.f115641OooOoOO;
        oO0O0OOo.OooOO0O oooOO0O = this.f115640OooOoO0;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                o0OO00O o0oo00o2 = (o0OO00O) this.f115637OooOo;
                oooOO0O.Oooo00O(oO0O0OOo.OooOO0.WRITE, false);
                io.ktor.utils.p616io.OooO00o oooO00o = this.f115639OooOoO;
                OooO00o oooO00o2 = new OooO00o(this.f115643OooOoo0, o0oo00o2, oooO00o, writableByteChannel, this.f115640OooOoO0, this.f115642OooOoo, null);
                this.f115638OooOo0o = 1;
                if (io.ktor.utils.p616io.OooO00o.OoooO0O(oooO00o, oooO00o2, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            oooOO0O.Oooo00O(oO0O0OOo.OooOO0.WRITE, false);
            if (writableByteChannel instanceof SocketChannel) {
                try {
                    if (OooOOO0.f115666OooO00o) {
                        ((SocketChannel) writableByteChannel).shutdownOutput();
                    } else {
                        ((SocketChannel) writableByteChannel).socket().shutdownOutput();
                    }
                } catch (ClosedChannelException unused) {
                }
            }
            return C32460OooOooO.f116667OooO00o;
        } finally {
        }
    }
}
