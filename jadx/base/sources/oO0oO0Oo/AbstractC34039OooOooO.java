package oO0oO0Oo;

import Oooo0oO.C21111o0ooOoO;
import com.aspose.slides.C22206OooOOo0;
import com.huawei.hms.network.embedded.C18416x7;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import oOO000oO.C34332OooO00o;

/* JADX INFO: renamed from: oO0oO0Oo.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC34039OooOooO extends AbstractC34036OooOoOO implements Iterable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final OooO00o f122370OooOo = new OooO00o(AbstractC34039OooOooO.class);

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public InterfaceC34019OooO0oO[] f122371OooOo0o;

    /* JADX INFO: renamed from: oO0oO0Oo.OooOooO$OooO00o */
    public static class OooO00o extends AbstractC34046Oooo0o {
        @Override // oO0oO0Oo.AbstractC34046Oooo0o
        public final AbstractC34036OooOoOO OooO0OO(AbstractC34039OooOooO abstractC34039OooOooO) {
            return abstractC34039OooOooO;
        }
    }

    /* JADX INFO: renamed from: oO0oO0Oo.OooOooO$OooO0O0 */
    public class OooO0O0 implements Enumeration {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f122372OooO00o = 0;

        public OooO0O0() {
        }

        @Override // java.util.Enumeration
        public final boolean hasMoreElements() {
            return this.f122372OooO00o < AbstractC34039OooOooO.this.f122371OooOo0o.length;
        }

        @Override // java.util.Enumeration
        public final Object nextElement() {
            int i = this.f122372OooO00o;
            InterfaceC34019OooO0oO[] interfaceC34019OooO0oOArr = AbstractC34039OooOooO.this.f122371OooOo0o;
            if (i >= interfaceC34019OooO0oOArr.length) {
                throw new NoSuchElementException();
            }
            this.f122372OooO00o = i + 1;
            return interfaceC34019OooO0oOArr[i];
        }
    }

    public AbstractC34039OooOooO() {
        this.f122371OooOo0o = C34020OooO0oo.f122324OooO0Oo;
    }

    public static AbstractC34039OooOooO OooOOoo(Object obj) {
        if (obj == null || (obj instanceof AbstractC34039OooOooO)) {
            return (AbstractC34039OooOooO) obj;
        }
        if (obj instanceof InterfaceC34019OooO0oO) {
            AbstractC34036OooOoOO abstractC34036OooOoOOOooO0o = ((InterfaceC34019OooO0oO) obj).OooO0o();
            if (abstractC34036OooOoOOOooO0o instanceof AbstractC34039OooOooO) {
                return (AbstractC34039OooOooO) abstractC34036OooOoOOOooO0o;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (AbstractC34039OooOooO) f122370OooOo.OooO0O0((byte[]) obj);
            } catch (IOException e) {
                throw new IllegalArgumentException(C21111o0ooOoO.OooO00o(e, new StringBuilder("failed to construct sequence from byte[]: ")));
            }
        }
        throw new IllegalArgumentException(C22206OooOOo0.OooO0OO(obj, "unknown object in getInstance: "));
    }

    public static AbstractC34039OooOooO OooOo00(Oooo0 oooo0, boolean z) {
        return (AbstractC34039OooOooO) f122370OooOo.OooO0o0(oooo0, z);
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final boolean OooO0oo(AbstractC34036OooOoOO abstractC34036OooOoOO) {
        if (!(abstractC34036OooOoOO instanceof AbstractC34039OooOooO)) {
            return false;
        }
        AbstractC34039OooOooO abstractC34039OooOooO = (AbstractC34039OooOooO) abstractC34036OooOoOO;
        int size = size();
        if (abstractC34039OooOooO.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            AbstractC34036OooOoOO abstractC34036OooOoOOOooO0o = this.f122371OooOo0o[i].OooO0o();
            AbstractC34036OooOoOO abstractC34036OooOoOOOooO0o2 = abstractC34039OooOooO.f122371OooOo0o[i].OooO0o();
            if (abstractC34036OooOoOOOooO0o != abstractC34036OooOoOOOooO0o2 && !abstractC34036OooOoOOOooO0o.OooO0oo(abstractC34036OooOoOOOooO0o2)) {
                return false;
            }
        }
        return true;
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final boolean OooOO0() {
        return true;
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public AbstractC34036OooOoOO OooOOOO() {
        o00oO0O o00oo0o = new o00oO0O(this.f122371OooOo0o);
        o00oo0o.f122444OooOoO0 = -1;
        return o00oo0o;
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public AbstractC34036OooOoOO OooOOOo() {
        o00000O0 o00000o02 = new o00000O0(this.f122371OooOo0o);
        o00000o02.f122428OooOoO0 = -1;
        return o00000o02;
    }

    public final AbstractC34033OooOo0o[] OooOOo() {
        int size = size();
        AbstractC34033OooOo0o[] abstractC34033OooOo0oArr = new AbstractC34033OooOo0o[size];
        for (int i = 0; i < size; i++) {
            abstractC34033OooOo0oArr[i] = AbstractC34033OooOo0o.OooOOo0(this.f122371OooOo0o[i]);
        }
        return abstractC34033OooOo0oArr;
    }

    public final AbstractC34015OooO0OO[] OooOOo0() {
        int size = size();
        AbstractC34015OooO0OO[] abstractC34015OooO0OOArr = new AbstractC34015OooO0OO[size];
        for (int i = 0; i < size; i++) {
            abstractC34015OooO0OOArr[i] = AbstractC34015OooO0OO.OooOOoo(this.f122371OooOo0o[i]);
        }
        return abstractC34015OooO0OOArr;
    }

    public abstract AbstractC34022OooOO0O OooOo();

    public InterfaceC34019OooO0oO OooOo0(int i) {
        return this.f122371OooOo0o[i];
    }

    public Enumeration OooOo0O() {
        return new OooO0O0();
    }

    public abstract AbstractC34015OooO0OO OooOo0o();

    public abstract AbstractC34040OooOooo OooOoO();

    public abstract AbstractC34033OooOo0o OooOoO0();

    @Override // oO0oO0Oo.AbstractC34036OooOoOO, oO0oO0Oo.OooOo00
    public int hashCode() {
        int length = this.f122371OooOo0o.length;
        int iHashCode = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return iHashCode;
            }
            iHashCode = (iHashCode * 257) ^ this.f122371OooOo0o[length].OooO0o().hashCode();
        }
    }

    @Override // java.lang.Iterable
    public Iterator<InterfaceC34019OooO0oO> iterator() {
        return new C34332OooO00o.C20351OooO00o(this.f122371OooOo0o);
    }

    public int size() {
        return this.f122371OooOo0o.length;
    }

    public final String toString() {
        int size = size();
        if (size == 0) {
            return C18416x7.f56644n;
        }
        StringBuffer stringBuffer = new StringBuffer("[");
        int i = 0;
        while (true) {
            stringBuffer.append(this.f122371OooOo0o[i]);
            i++;
            if (i >= size) {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
            stringBuffer.append(", ");
        }
    }

    public AbstractC34039OooOooO(C34020OooO0oo c34020OooO0oo) {
        if (c34020OooO0oo == null) {
            throw new NullPointerException("'elementVector' cannot be null");
        }
        this.f122371OooOo0o = c34020OooO0oo.OooO0OO();
    }

    public AbstractC34039OooOooO(AbstractC34036OooOoOO abstractC34036OooOoOO) {
        if (abstractC34036OooOoOO == null) {
            throw new NullPointerException("'element' cannot be null");
        }
        this.f122371OooOo0o = new InterfaceC34019OooO0oO[]{abstractC34036OooOoOO};
    }

    public AbstractC34039OooOooO(InterfaceC34019OooO0oO[] interfaceC34019OooO0oOArr) {
        this.f122371OooOo0o = interfaceC34019OooO0oOArr;
    }
}
