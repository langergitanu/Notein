package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC21794OooOO0o;
import androidx.datastore.preferences.protobuf.OooO;
import androidx.datastore.preferences.protobuf.OooO00o;
import androidx.datastore.preferences.protobuf.OooO00o.AbstractC19010OooO00o;
import java.io.IOException;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooO00o<MessageType extends OooO00o<MessageType, BuilderType>, BuilderType extends AbstractC19010OooO00o<MessageType, BuilderType>> implements InterfaceC21822OoooO0 {
    protected int memoizedHashCode = 0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.OooO00o$OooO00o, reason: collision with other inner class name */
    public static abstract class AbstractC19010OooO00o<MessageType extends OooO00o<MessageType, BuilderType>, BuilderType extends AbstractC19010OooO00o<MessageType, BuilderType>> implements InterfaceC21824OoooO0O, Cloneable {
    }

    public int OooO0OO() {
        throw new UnsupportedOperationException();
    }

    public int OooO0Oo(InterfaceC21836Oooooo interfaceC21836Oooooo) {
        int iOooO0OO = OooO0OO();
        if (iOooO0OO != -1) {
            return iOooO0OO;
        }
        int iOooO00o = interfaceC21836Oooooo.OooO00o(this);
        OooO0o0(iOooO00o);
        return iOooO00o;
    }

    public void OooO0o0(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC21822OoooO0
    public final OooO.OooO0o toByteString() {
        try {
            int iOooO0Oo = ((OooOo) this).OooO0Oo(null);
            OooO.OooO0o oooO0o = OooO.f64403OooOo;
            byte[] bArr = new byte[iOooO0Oo];
            Logger logger = AbstractC21794OooOO0o.f64440OooO0O0;
            AbstractC21794OooOO0o.OooO0O0 oooO0O0 = new AbstractC21794OooOO0o.OooO0O0(bArr, iOooO0Oo);
            ((OooOo) this).OooO0O0(oooO0O0);
            if (oooO0O0.f64448OooO0o0 - oooO0O0.f64447OooO0o == 0) {
                return new OooO.OooO0o(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e);
        }
    }
}
