package oO00OoO0;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0o implements Externalizable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f116054OooOoO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public boolean f116057OooOoo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f116053OooOo0o = "";

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f116052OooOo = "";

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final ArrayList f116055OooOoO0 = new ArrayList();

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public String f116056OooOoOO = "";

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f116058OooOoo0 = false;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public String f116059OooOooO = "";

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        this.f116053OooOo0o = objectInput.readUTF();
        this.f116052OooOo = objectInput.readUTF();
        int i = objectInput.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            this.f116055OooOoO0.add(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            String utf = objectInput.readUTF();
            this.f116054OooOoO = true;
            this.f116056OooOoOO = utf;
        }
        if (objectInput.readBoolean()) {
            String utf2 = objectInput.readUTF();
            this.f116057OooOoo = true;
            this.f116059OooOooO = utf2;
        }
        this.f116058OooOoo0 = objectInput.readBoolean();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeUTF(this.f116053OooOo0o);
        objectOutput.writeUTF(this.f116052OooOo);
        int size = this.f116055OooOoO0.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            objectOutput.writeUTF((String) this.f116055OooOoO0.get(i));
        }
        objectOutput.writeBoolean(this.f116054OooOoO);
        if (this.f116054OooOoO) {
            objectOutput.writeUTF(this.f116056OooOoOO);
        }
        objectOutput.writeBoolean(this.f116057OooOoo);
        if (this.f116057OooOoo) {
            objectOutput.writeUTF(this.f116059OooOooO);
        }
        objectOutput.writeBoolean(this.f116058OooOoo0);
    }
}
