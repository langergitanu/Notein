package oO00ooOO;

import androidx.appcompat.widget.C21532OooOOo;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import kotlin.jvm.internal.OooOOO0;
import oOo000Oo.C34436OooOoOO;

/* JADX INFO: renamed from: oO00ooOO.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32472OooO0oo implements Externalizable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f116715OooOo0o = C34436OooOoOO.f123455OooOo0o;

    private final Object readResolve() {
        return this.f116715OooOo0o;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput input) throws IOException {
        OooOOO0.OooO0oO(input, "input");
        byte b = input.readByte();
        if (b != 0) {
            throw new InvalidObjectException(C21532OooOOo.OooO0OO(b, "Unsupported flags value: "));
        }
        int i = input.readInt();
        if (i < 0) {
            throw new InvalidObjectException("Illegal size value: " + i + FilenameUtils.EXTENSION_SEPARATOR);
        }
        C32466OooO0OO c32466OooO0OO = new C32466OooO0OO(i);
        for (int i2 = 0; i2 < i; i2++) {
            c32466OooO0OO.put(input.readObject(), input.readObject());
        }
        this.f116715OooOo0o = c32466OooO0OO.OooO0O0();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Map] */
    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput output) throws IOException {
        OooOOO0.OooO0oO(output, "output");
        output.writeByte(0);
        output.writeInt(this.f116715OooOo0o.size());
        for (Map.Entry entry : this.f116715OooOo0o.entrySet()) {
            output.writeObject(entry.getKey());
            output.writeObject(entry.getValue());
        }
    }
}
