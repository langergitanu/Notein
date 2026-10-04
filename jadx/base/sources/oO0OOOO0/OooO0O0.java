package oO0OOOO0;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import oO0OOOO0.InterfaceC32958OooOOOo;
import oO0OOOO0.OooO00o;

/* JADX INFO: loaded from: classes10.dex */
public abstract class OooO0O0<MessageType extends InterfaceC32958OooOOOo> implements InterfaceC32959OooOOo<MessageType> {
    static {
        int i = OooO0o.f119069OooO0O0;
    }

    public static void OooO0O0(InterfaceC32958OooOOOo interfaceC32958OooOOOo) throws OooOO0 {
        C32965OooOo0O c32965OooOo0O;
        if (interfaceC32958OooOOOo == null || interfaceC32958OooOOOo.isInitialized()) {
            return;
        }
        if (interfaceC32958OooOOOo instanceof OooO00o) {
            c32965OooOo0O = new C32965OooOo0O();
        } else {
            c32965OooOo0O = new C32965OooOo0O();
        }
        OooOO0 oooOO02 = new OooOO0(c32965OooOo0O.getMessage());
        oooOO02.f119095OooOo0o = interfaceC32958OooOOOo;
        throw oooOO02;
    }

    public final InterfaceC32958OooOOOo OooO0OO(ByteArrayInputStream byteArrayInputStream, OooO0o oooO0o) throws OooOO0 {
        MessageType messagetype;
        try {
            int i = byteArrayInputStream.read();
            if (i == -1) {
                messagetype = null;
            } else {
                if ((i & 128) != 0) {
                    i &= 127;
                    int i2 = 7;
                    while (true) {
                        if (i2 >= 32) {
                            while (i2 < 64) {
                                int i3 = byteArrayInputStream.read();
                                if (i3 == -1) {
                                    throw OooOO0.OooO00o();
                                }
                                if ((i3 & 128) != 0) {
                                    i2 += 7;
                                }
                            }
                            throw new OooOO0("CodedInputStream encountered a malformed varint.");
                        }
                        int i4 = byteArrayInputStream.read();
                        if (i4 == -1) {
                            throw OooOO0.OooO00o();
                        }
                        i |= (i4 & 127) << i2;
                        if ((i4 & 128) == 0) {
                            break;
                        }
                        i2 += 7;
                    }
                }
                C32951OooO0Oo c32951OooO0Oo = new C32951OooO0Oo(new OooO00o.AbstractC20287OooO00o.C20288OooO00o(byteArrayInputStream, i));
                MessageType messagetypeOooO00o = OooO00o(c32951OooO0Oo, oooO0o);
                try {
                    c32951OooO0Oo.OooO00o(0);
                    messagetype = messagetypeOooO00o;
                } catch (OooOO0 e) {
                    e.f119095OooOo0o = messagetypeOooO00o;
                    throw e;
                }
            }
            OooO0O0(messagetype);
            return messagetype;
        } catch (IOException e2) {
            throw new OooOO0(e2.getMessage());
        }
    }
}
