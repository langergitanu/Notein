package oO00ooOO;

import com.facebook.soloader.OooOo;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.OooOOO0;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34449Oooo0oo;

/* JADX INFO: renamed from: oO00ooOO.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32471OooO0oO implements Externalizable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f116713OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f116714OooOo0o;

    public C32471OooO0oO(Collection<?> collection, int i) {
        this.f116714OooOo0o = collection;
        this.f116713OooOo = i;
    }

    private final Object readResolve() {
        return this.f116714OooOo0o;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput input) throws IOException {
        Object objOooO0O0;
        OooOOO0.OooO0oO(input, "input");
        byte b = input.readByte();
        int i = b & 1;
        if ((b & (-2)) != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) b) + FilenameUtils.EXTENSION_SEPARATOR);
        }
        int i2 = input.readInt();
        if (i2 < 0) {
            throw new InvalidObjectException("Illegal size value: " + i2 + FilenameUtils.EXTENSION_SEPARATOR);
        }
        int i3 = 0;
        if (i == 0) {
            C32465OooO0O0 c32465OooO0O0 = new C32465OooO0O0(i2);
            while (i3 < i2) {
                c32465OooO0O0.add(input.readObject());
                i3++;
            }
            objOooO0O0 = OooOo.OooO0O0(c32465OooO0O0);
        } else {
            if (i != 1) {
                throw new InvalidObjectException("Unsupported collection type tag: " + i + FilenameUtils.EXTENSION_SEPARATOR);
            }
            C32463OooO c32463OooO = new C32463OooO(new C32466OooO0OO(i2));
            while (i3 < i2) {
                c32463OooO.add(input.readObject());
                i3++;
            }
            objOooO0O0 = C34449Oooo0oo.OooO0Oo(c32463OooO);
        }
        this.f116714OooOo0o = objOooO0O0;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Collection] */
    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput output) throws IOException {
        OooOOO0.OooO0oO(output, "output");
        output.writeByte(this.f116713OooOo);
        output.writeInt(this.f116714OooOo0o.size());
        Iterator it = this.f116714OooOo0o.iterator();
        while (it.hasNext()) {
            output.writeObject(it.next());
        }
    }

    public C32471OooO0oO() {
        this(C34434OooOoO.f123453OooOo0o, 0);
    }
}
