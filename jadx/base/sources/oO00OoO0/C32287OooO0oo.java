package oO00OoO0;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;

/* JADX INFO: renamed from: oO00OoO0.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32287OooO0oo implements Externalizable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f116167OooOo0o;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f116170OooOoOO;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f116166OooOo = "";

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final ArrayList f116169OooOoO0 = new ArrayList();

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final ArrayList f116168OooOoO = new ArrayList();

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public String f116171OooOoo0 = "";

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        if (objectInput.readBoolean()) {
            String utf = objectInput.readUTF();
            this.f116167OooOo0o = true;
            this.f116166OooOo = utf;
        }
        int i = objectInput.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            this.f116169OooOoO0.add(Integer.valueOf(objectInput.readInt()));
        }
        int i3 = objectInput.readInt();
        for (int i4 = 0; i4 < i3; i4++) {
            this.f116168OooOoO.add(Integer.valueOf(objectInput.readInt()));
        }
        if (objectInput.readBoolean()) {
            String utf2 = objectInput.readUTF();
            this.f116170OooOoOO = true;
            this.f116171OooOoo0 = utf2;
        }
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeBoolean(this.f116167OooOo0o);
        if (this.f116167OooOo0o) {
            objectOutput.writeUTF(this.f116166OooOo);
        }
        int size = this.f116169OooOoO0.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            objectOutput.writeInt(((Integer) this.f116169OooOoO0.get(i)).intValue());
        }
        ArrayList arrayList = this.f116168OooOoO;
        int size2 = arrayList.size();
        objectOutput.writeInt(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            objectOutput.writeInt(((Integer) arrayList.get(i2)).intValue());
        }
        objectOutput.writeBoolean(this.f116170OooOoOO);
        if (this.f116170OooOoOO) {
            objectOutput.writeUTF(this.f116171OooOoo0);
        }
    }
}
