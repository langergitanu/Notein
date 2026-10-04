package oO00O0oo;

import java.net.InetSocketAddress;
import java.nio.channels.SocketChannel;
import java.nio.channels.spi.SelectorProvider;
import oO00O0oo.OooOo00;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O0OOo.C32654OooO0O0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOO0 {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO00o(C32654OooO0O0 c32654OooO0O0, C32222OooOO0o address, OooOo00.OooO0OO oooO0OO, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        OooO oooO;
        SocketChannel socketChannel;
        if (abstractC32479OooO0OO instanceof OooO) {
            oooO = (OooO) abstractC32479OooO0OO;
            int i = oooO.f115618OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO.f115618OooOoO = i - Integer.MIN_VALUE;
            } else {
                oooO = new OooO(abstractC32479OooO0OO);
            }
        }
        Object obj = oooO.f115619OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO.f115618OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            SelectorProvider selectorProvider = c32654OooO0O0.f117379OooOo0o;
            kotlin.jvm.internal.OooOOO0.OooO0oO(selectorProvider, "<this>");
            kotlin.jvm.internal.OooOOO0.OooO0oO(address, "address");
            SocketChannel connect$lambda$2 = selectorProvider.openSocketChannel();
            try {
                kotlin.jvm.internal.OooOOO0.OooO0o(connect$lambda$2, "connect$lambda$2");
                OooOOO0.OooO00o(connect$lambda$2, oooO0OO);
                kotlin.jvm.internal.OooOOO0.OooO0o(connect$lambda$2, "connect$lambda$2");
                connect$lambda$2.configureBlocking(false);
                C32226OooOOoo c32226OooOOoo = new C32226OooOOoo(connect$lambda$2, c32654OooO0O0, oooO0OO);
                InetSocketAddress inetSocketAddress = address.f115663OooO00o;
                oooO.f115617OooOo0o = connect$lambda$2;
                oooO.f115616OooOo = c32226OooOOoo;
                oooO.f115618OooOoO = 1;
                return c32226OooOOoo.Oooo00o(inetSocketAddress, oooO) == enumC32485OooO00o ? enumC32485OooO00o : c32226OooOOoo;
            } catch (Throwable th) {
                th = th;
                socketChannel = connect$lambda$2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32226OooOOoo c32226OooOOoo2 = oooO.f115616OooOo;
            socketChannel = oooO.f115617OooOo0o;
            try {
                C32446OooOOOo.OooO0O0(obj);
                return c32226OooOOoo2;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        socketChannel.close();
        throw th;
    }
}
