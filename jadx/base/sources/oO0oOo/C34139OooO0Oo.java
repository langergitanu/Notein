package oO0oOo;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import oO0oO0Oo.AbstractC34015OooO0OO;
import oO0oO0Oo.AbstractC34036OooOoOO;
import oO0oO0Oo.AbstractC34039OooOooO;
import oO0oO0Oo.AbstractC34040OooOooo;
import oO0oO0Oo.C34018OooO0o0;
import oO0oO0Oo.C34027OooOOOo;
import oO0oO0Oo.Oooo0;
import oO0oOOoo.C34135OooO0OO;
import oO0oOo0.C34141OooO;
import oO0oOo0.C34148OooO0oO;
import oO0oOo0.C34150OooOO0;
import oO0oOo0.C34151OooOO0O;
import oO0oOo0.C34152OooOO0o;
import oO0oOo0.C34154OooOOO0;
import oO0oOo0.C34156OooOOOo;
import oO0oOo0.C34157OooOOo;
import oOO000oO.InterfaceC34334OooO0OO;

/* JADX INFO: renamed from: oO0oOo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34139OooO0Oo implements InterfaceC34334OooO0OO, Serializable {
    private static final long serialVersionUID = 20170722001L;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public transient C34148OooO0oO f122679OooOo0o;

    public C34139OooO0Oo(byte[] bArr) throws IOException {
        try {
            AbstractC34036OooOoOO abstractC34036OooOoOOOooOOoo = new C34027OooOOOo(new ByteArrayInputStream(bArr)).OooOOoo();
            if (abstractC34036OooOoOOOooOOoo == null) {
                throw new IOException("no content found");
            }
            OooO00o(C34148OooO0oO.OooO0oo(abstractC34036OooOoOOOooOOoo));
        } catch (ClassCastException e) {
            throw new C34136OooO00o("malformed data: " + e.getMessage(), e);
        } catch (IllegalArgumentException e2) {
            throw new C34136OooO00o("malformed data: " + e2.getMessage(), e2);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        OooO00o(C34148OooO0oO.OooO0oo(objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f122679OooOo0o.getEncoded());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void OooO00o(C34148OooO0oO c34148OooO0oO) {
        C34156OooOOOo c34156OooOOOo;
        C34141OooO c34141OooO;
        this.f122679OooOo0o = c34148OooO0oO;
        C34151OooOO0O c34151OooOO0O = c34148OooO0oO.f122704OooOo0o.f122748OooOoo;
        if (c34151OooOO0O != null) {
            C34150OooOO0 c34150OooOO0 = (C34150OooOO0) c34151OooOO0O.f122717OooOo0o.get(C34150OooOO0.f122712OooOoOO);
            if (c34150OooOO0 != null) {
                AbstractC34036OooOoOO abstractC34036OooOoOOOooO0oo = c34150OooOO0.OooO0oo();
                if (abstractC34036OooOoOOOooO0oo != null) {
                    AbstractC34039OooOooO abstractC34039OooOooOOooOOoo = AbstractC34039OooOooO.OooOOoo(abstractC34036OooOoOOOooO0oo);
                    c34156OooOOOo = new C34156OooOOOo();
                    c34156OooOOOo.f122733OooOoo = abstractC34039OooOooOOooOOoo;
                    for (int i = 0; i != abstractC34039OooOooOOooOOoo.size(); i++) {
                        Oooo0 oooo0OooOOoo = Oooo0.OooOOoo(abstractC34039OooOooOOooOOoo.OooOo0(i));
                        int i2 = oooo0OooOOoo.f122380OooOoO0;
                        if (i2 == 0) {
                            if (128 != oooo0OooOOoo.f122377OooOo) {
                                throw new IllegalStateException("this method only valid for CONTEXT_SPECIFIC tags");
                            }
                            if (!oooo0OooOOoo.OooOo0()) {
                                throw new IllegalStateException("object implicit - explicit expected.");
                            }
                            AbstractC34036OooOoOO abstractC34036OooOoOOOooO0o = oooo0OooOOoo.f122379OooOoO.OooO0o();
                            if (!(abstractC34036OooOoOOOooO0o instanceof Oooo0)) {
                                throw new IllegalStateException("unexpected object: ".concat(abstractC34036OooOoOOOooO0o.getClass().getName()));
                            }
                            Oooo0 oooo0 = (Oooo0) abstractC34036OooOoOOOooO0o;
                            if (oooo0 != 0) {
                                c34141OooO = new C34141OooO();
                                int i3 = oooo0.f122380OooOoO0;
                                c34141OooO.f122682OooOo = i3;
                                if (i3 == 0) {
                                    c34141OooO.f122683OooOo0o = new C34154OooOOO0((AbstractC34039OooOooO) AbstractC34039OooOooO.f122370OooOo.OooO0o0(oooo0, false));
                                } else {
                                    c34141OooO.f122683OooOo0o = (AbstractC34040OooOooo) AbstractC34040OooOooo.f122374OooOoO0.OooO0o0(oooo0, false);
                                }
                            } else {
                                c34141OooO = (C34141OooO) oooo0;
                            }
                            c34156OooOOOo.f122729OooOo0o = c34141OooO;
                        } else if (i2 == 1) {
                            c34156OooOOOo.f122728OooOo = ((C34018OooO0o0) C34018OooO0o0.f122320OooOo.OooO0o0(oooo0OooOOoo, false)).OooOOo();
                        } else if (i2 == 2) {
                            c34156OooOOOo.f122731OooOoO0 = ((C34018OooO0o0) C34018OooO0o0.f122320OooOo.OooO0o0(oooo0OooOOoo, false)).OooOOo();
                        } else if (i2 == 3) {
                            AbstractC34015OooO0OO abstractC34015OooO0OO = (AbstractC34015OooO0OO) AbstractC34015OooO0OO.f122317OooOo.OooO0o0(oooo0OooOOoo, false);
                            c34156OooOOOo.f122730OooOoO = new C34157OooOOo(abstractC34015OooO0OO.OooOOo(), abstractC34015OooO0OO.OooO0o0());
                        } else if (i2 == 4) {
                            c34156OooOOOo.f122732OooOoOO = ((C34018OooO0o0) C34018OooO0o0.f122320OooOo.OooO0o0(oooo0OooOOoo, false)).OooOOo();
                        } else {
                            if (i2 != 5) {
                                throw new IllegalArgumentException("unknown tag in IssuingDistributionPoint");
                            }
                            c34156OooOOOo.f122734OooOoo0 = ((C34018OooO0o0) C34018OooO0o0.f122320OooOo.OooO0o0(oooo0OooOOoo, false)).OooOOo();
                        }
                    }
                } else {
                    c34156OooOOOo = null;
                }
                boolean z = c34156OooOOOo.f122732OooOoOO;
            }
        }
        C34135OooO0OO c34135OooO0OO = c34148OooO0oO.f122704OooOo0o.f122746OooOoO0;
        C34152OooOO0o c34152OooOO0o = new C34152OooOO0o();
        c34152OooOO0o.f122719OooOo0o = c34135OooO0OO;
        c34152OooOO0o.f122718OooOo = 4;
        new C34154OooOOO0(c34152OooOO0o);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C34139OooO0Oo) {
            return this.f122679OooOo0o.equals(((C34139OooO0Oo) obj).f122679OooOo0o);
        }
        return false;
    }

    @Override // oOO000oO.InterfaceC34334OooO0OO
    public final byte[] getEncoded() throws IOException {
        return this.f122679OooOo0o.getEncoded();
    }

    public final int hashCode() {
        return this.f122679OooOo0o.hashCode();
    }
}
