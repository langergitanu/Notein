package oO0oOoO;

import java.util.ArrayList;
import o00o00O0.C25251OooO0O0;
import oO0oO0Oo.AbstractC34033OooOo0o;
import oO0oO0Oo.AbstractC34036OooOoOO;
import oO0oO0Oo.AbstractC34039OooOooO;
import oO0oO0Oo.AbstractC34040OooOooo;
import oO0oO0Oo.C34025OooOOO0;
import oO0oO0Oo.C34029OooOOo0;
import oO0oO0Oo.C34032OooOo0O;
import oO0oO0Oo.C34079o0ooOoO;
import oO0oO0Oo.InterfaceC34019OooO0oO;
import oO0oO0Oo.Oooo0;
import oO0oO0oo.C34083OooO;
import oO0oO0oo.C34089OooO0o0;
import oO0oO0oo.C34090OooO0oO;
import oO0oO0oo.C34091OooO0oo;
import oO0oO0oo.C34092OooOO0;
import oO0oO0oo.C34093OooOO0O;
import oO0oO0oo.C34095OooOOO;
import oO0oO0oo.C34096OooOOO0;
import oO0oO0oo.C34097OooOOOO;
import oO0oO0oo.C34098OooOOOo;
import oO0oO0oo.C34099OooOOo;
import oO0oO0oo.C34100OooOOo0;
import oO0oO0oo.C34101OooOOoo;
import oO0oO0oo.C34102OooOo00;
import oO0oOo0.C34142OooO00o;
import oO0oOo0.C34159OooOOoo;

/* JADX INFO: renamed from: oO0oOoO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34177OooO0Oo {

    /* JADX INFO: renamed from: oO0oOoO.OooO0Oo$OooO00o */
    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C25251OooO0O0 f122812OooO00o;

        public OooO00o(C34032OooOo0O c34032OooOo0O, C25251OooO0O0 c25251OooO0O0) {
            this.f122812OooO00o = c25251OooO0O0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x0377, code lost:
    
        throw new java.lang.IllegalArgumentException("Invalid KeyAgreeRecipientIdentifier: ".concat(r15.getClass().getName()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x016c, code lost:
    
        throw new java.lang.IllegalArgumentException("Invalid OriginatorIdentifierOrKey: ".concat(r14.getClass().getName()));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0087  */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean, int] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C34192OooOo0 OooO00o(AbstractC34040OooOooo abstractC34040OooOooo, C34142OooO00o c34142OooO00o, OooO00o oooO00o) {
        C34101OooOOoo c34101OooOOoo;
        C34099OooOOo c34099OooOOo;
        Object objOooO0oo;
        Object obj;
        int i;
        char c;
        C34100OooOOo0 c34100OooOOo0;
        C34091OooO0oo c34091OooO0oo;
        C34102OooOo00 c34102OooOo00;
        Object obj2;
        C34185OooOOO c34185OooOOO;
        C34093OooOO0O c34093OooOO0O;
        int i2;
        C34093OooOO0O c34093OooOO0O2;
        InterfaceC34019OooO0oO interfaceC34019OooO0oOOooOo0;
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        int i3 = 0;
        loop0: while (true) {
            InterfaceC34019OooO0oO[] interfaceC34019OooO0oOArr = abstractC34040OooOooo.f122376OooOo0o;
            if (i3 == interfaceC34019OooO0oOArr.length) {
                return new C34192OooOo0(arrayList);
            }
            InterfaceC34019OooO0oO interfaceC34019OooO0oO = interfaceC34019OooO0oOArr[i3];
            if (interfaceC34019OooO0oO == null || (interfaceC34019OooO0oO instanceof C34101OooOOoo)) {
                c34101OooOOoo = (C34101OooOOoo) interfaceC34019OooO0oO;
            } else if (interfaceC34019OooO0oO instanceof AbstractC34039OooOooO) {
                c34101OooOOoo = new C34101OooOOoo((AbstractC34039OooOooO) interfaceC34019OooO0oO);
            } else {
                if (!(interfaceC34019OooO0oO instanceof Oooo0)) {
                    throw new IllegalArgumentException("unknown object in factory: ".concat(interfaceC34019OooO0oO.getClass().getName()));
                }
                c34101OooOOoo = new C34101OooOOoo((Oooo0) interfaceC34019OooO0oO);
            }
            oO0oO0Oo.OooOo00 oooOo00 = c34101OooOOoo.f122514OooOo0o;
            boolean z2 = oooOo00 instanceof Oooo0;
            AbstractC34039OooOooO.OooO00o oooO00o2 = AbstractC34039OooOooO.f122370OooOo;
            char c2 = 2;
            int i4 = 1;
            if (z2) {
                Oooo0 oooo0 = (Oooo0) oooOo00;
                int i5 = oooo0.f122380OooOoO0;
                if (i5 == 1) {
                    AbstractC34039OooOooO abstractC34039OooOooOOooOo00 = AbstractC34039OooOooO.OooOo00(oooo0, z);
                    if (abstractC34039OooOooOOooOo00 != null) {
                        AbstractC34039OooOooO abstractC34039OooOooOOooOOoo = AbstractC34039OooOooO.OooOOoo(abstractC34039OooOooOOooOo00);
                        C34083OooO c34083OooO = new C34083OooO();
                        c34083OooO.f122465OooOo0o = (C34029OooOOo0) abstractC34039OooOooOOooOOoo.OooOo0(z ? 1 : 0);
                        oO0oO0Oo.OooOo00 OooOo002 = ((Oooo0) abstractC34039OooOooOOooOOoo.OooOo0(1)).OooOo00();
                        if (OooOo002 == null) {
                            c34093OooOO0O = (C34093OooOO0O) OooOo002;
                        } else if (OooOo002 instanceof AbstractC34039OooOooO) {
                            C34089OooO0o0 c34089OooO0o0OooO0oo = C34089OooO0o0.OooO0oo(OooOo002);
                            c34093OooOO0O = new C34093OooOO0O();
                            c34093OooOO0O.f122498OooOo0o = c34089OooO0o0OooO0oo;
                        } else {
                            if (!(OooOo002 instanceof Oooo0)) {
                                break;
                            }
                            Oooo0 oooo02 = (Oooo0) OooOo002;
                            int i6 = oooo02.f122380OooOoO0;
                            if (i6 != 0) {
                                if (i6 != 1) {
                                    break;
                                }
                                C34096OooOOO0 c34096OooOOO0OooO0oo = C34096OooOOO0.OooO0oo(oooo02);
                                c34093OooOO0O2 = new C34093OooOO0O();
                                c34093OooOO0O2.f122498OooOo0o = new C34079o0ooOoO(2, 128, 1, c34096OooOOO0OooO0oo);
                            } else {
                                C34159OooOOoo c34159OooOOooOooO0oo = C34159OooOOoo.OooO0oo(oooo02);
                                c34093OooOO0O2 = new C34093OooOO0O();
                                c34093OooOO0O2.f122498OooOo0o = new C34079o0ooOoO(2, 128, z ? 1 : 0, c34159OooOOooOooO0oo);
                            }
                            c34093OooOO0O = c34093OooOO0O2;
                        }
                        c34083OooO.f122464OooOo = c34093OooOO0O;
                        if (abstractC34039OooOooOOooOOoo.OooOo0(2) instanceof Oooo0) {
                            c34083OooO.f122467OooOoO0 = AbstractC34033OooOo0o.OooOOo((Oooo0) abstractC34039OooOooOOooOOoo.OooOo0(2), true);
                            i2 = 3;
                        } else {
                            i2 = 2;
                        }
                        c34083OooO.f122466OooOoO = C34142OooO00o.OooO0oo(abstractC34039OooOooOOooOOoo.OooOo0(i2));
                        c34083OooO.f122468OooOoOO = (AbstractC34039OooOooO) abstractC34039OooOooOOooOOoo.OooOo0(i2 + 1);
                        obj = c34083OooO;
                    }
                } else if (i5 == 2) {
                    objOooO0oo = oooo0.OooOo0() ? C34090OooO0oO.OooO0oo(oooo0, true) : C34090OooO0oO.OooO0oo(oooo0, z);
                    obj = objOooO0oo;
                } else if (i5 == 3) {
                    AbstractC34039OooOooO abstractC34039OooOooOOooOo002 = AbstractC34039OooOooO.OooOo00(oooo0, z);
                    if (abstractC34039OooOooOOooOo002 != null) {
                        AbstractC34039OooOooO abstractC34039OooOooOOooOOoo2 = AbstractC34039OooOooO.OooOOoo(abstractC34039OooOooOOooOo002);
                        C34098OooOOOo c34098OooOOOo = new C34098OooOOOo();
                        c34098OooOOOo.f122508OooOo0o = (C34029OooOOo0) abstractC34039OooOooOOooOOoo2.OooOo0(z ? 1 : 0);
                        if (abstractC34039OooOooOOooOOoo2.OooOo0(1) instanceof Oooo0) {
                            c34098OooOOOo.f122507OooOo = C34142OooO00o.OooO0oo(AbstractC34039OooOooO.OooOo00((Oooo0) abstractC34039OooOooOOooOOoo2.OooOo0(1), z));
                            c34098OooOOOo.f122510OooOoO0 = C34142OooO00o.OooO0oo(abstractC34039OooOooOOooOOoo2.OooOo0(2));
                            interfaceC34019OooO0oOOooOo0 = abstractC34039OooOooOOooOOoo2.OooOo0(3);
                        } else {
                            c34098OooOOOo.f122510OooOoO0 = C34142OooO00o.OooO0oo(abstractC34039OooOooOOooOOoo2.OooOo0(1));
                            interfaceC34019OooO0oOOooOo0 = abstractC34039OooOooOOooOOoo2.OooOo0(2);
                        }
                        c34098OooOOOo.f122509OooOoO = (AbstractC34033OooOo0o) interfaceC34019OooO0oOOooOo0;
                        obj = c34098OooOOOo;
                    }
                } else {
                    if (i5 != 4) {
                        throw new IllegalStateException("unknown tag");
                    }
                    AbstractC34039OooOooO abstractC34039OooOooO = (AbstractC34039OooOooO) oooO00o2.OooO0o0(oooo0, z);
                    if (abstractC34039OooOooO != null) {
                        AbstractC34039OooOooO abstractC34039OooOooOOooOOoo3 = AbstractC34039OooOooO.OooOOoo(abstractC34039OooOooO);
                        C34097OooOOOO c34097OooOOOO = new C34097OooOOOO();
                        c34097OooOOOO.f122506OooOo0o = C34032OooOo0O.OooOo0(abstractC34039OooOooOOooOOoo3.OooOo0(z ? 1 : 0));
                        c34097OooOOOO.f122505OooOo = abstractC34039OooOooOOooOOoo3.OooOo0(1);
                        obj = c34097OooOOOO;
                    } else {
                        obj = null;
                    }
                }
            } else if (oooOo00 instanceof C34092OooOO0) {
                objOooO0oo = (C34092OooOO0) oooOo00;
                obj = objOooO0oo;
            } else if (oooOo00 != null) {
                AbstractC34039OooOooO abstractC34039OooOooOOooOOoo4 = AbstractC34039OooOooO.OooOOoo(oooOo00);
                C34092OooOO0 c34092OooOO0 = new C34092OooOO0();
                c34092OooOO0.f122495OooOo0o = (C34029OooOOo0) abstractC34039OooOooOOooOOoo4.OooOo0(z ? 1 : 0);
                InterfaceC34019OooO0oO interfaceC34019OooO0oOOooOo02 = abstractC34039OooOooOOooOOoo4.OooOo0(1);
                if (interfaceC34019OooO0oOOooOo02 == null || (interfaceC34019OooO0oOOooOo02 instanceof C34099OooOOo)) {
                    c34099OooOOo = (C34099OooOOo) interfaceC34019OooO0oOOooOo02;
                } else if (interfaceC34019OooO0oOOooOo02 instanceof C34089OooO0o0) {
                    c34099OooOOo = new C34099OooOOo();
                    c34099OooOOo.f122511OooOo0o = (C34089OooO0o0) interfaceC34019OooO0oOOooOo02;
                } else if (interfaceC34019OooO0oOOooOo02 instanceof AbstractC34033OooOo0o) {
                    C34099OooOOo c34099OooOOo2 = new C34099OooOOo();
                    c34099OooOOo2.f122511OooOo0o = new C34079o0ooOoO(2, 128, z ? 1 : 0, (AbstractC34033OooOo0o) interfaceC34019OooO0oOOooOo02);
                    c34099OooOOo = c34099OooOOo2;
                } else {
                    if (!(interfaceC34019OooO0oOOooOo02 instanceof AbstractC34036OooOoOO)) {
                        throw new IllegalArgumentException("Illegal object in RecipientIdentifier: ".concat(interfaceC34019OooO0oOOooOo02.getClass().getName()));
                    }
                    c34099OooOOo = new C34099OooOOo();
                    c34099OooOOo.f122511OooOo0o = (AbstractC34036OooOoOO) interfaceC34019OooO0oOOooOo02;
                }
                c34092OooOO0.f122494OooOo = c34099OooOOo;
                c34092OooOO0.f122497OooOoO0 = C34142OooO00o.OooO0oo(abstractC34039OooOooOOooOOoo4.OooOo0(2));
                c34092OooOO0.f122496OooOoO = (AbstractC34033OooOo0o) abstractC34039OooOooOOooOOoo4.OooOo0(3);
                obj = c34092OooOO0;
            }
            if (obj instanceof C34092OooOO0) {
                C34092OooOO0 c34092OooOO02 = (C34092OooOO0) obj;
                C34187OooOOOO c34187OooOOOO = new C34187OooOOOO(c34092OooOO02.f122497OooOoO0, c34142OooO00o, oooO00o);
                c34187OooOOOO.f122820OooO0o0 = c34092OooOO02;
                oO0oO0Oo.OooOo00 oooOo002 = c34092OooOO02.f122494OooOo.f122511OooOo0o;
                if (oooOo002 instanceof Oooo0) {
                    c34185OooOOO = new C34185OooOOO(null, null, AbstractC34033OooOo0o.OooOOo0(oooOo002 instanceof Oooo0 ? AbstractC34033OooOo0o.OooOOo((Oooo0) oooOo002, z) : C34089OooO0o0.OooO0oo(oooOo002)).f122362OooOo0o);
                } else {
                    C34089OooO0o0 c34089OooO0o0OooO0oo2 = C34089OooO0o0.OooO0oo(oooOo002 instanceof Oooo0 ? AbstractC34033OooOo0o.OooOOo((Oooo0) oooOo002, z) : C34089OooO0o0.OooO0oo(oooOo002));
                    c34185OooOOO = new C34185OooOOO(c34089OooO0o0OooO0oo2.f122487OooOo0o, c34089OooO0o0OooO0oo2.f122486OooOo.OooOOo(), null);
                }
                c34187OooOOOO.f122831OooO00o = c34185OooOOO;
                obj2 = c34187OooOOOO;
            } else if (obj instanceof C34090OooO0oO) {
                C34090OooO0oO c34090OooO0oO = (C34090OooO0oO) obj;
                C34182OooOO0 c34182OooOO0 = new C34182OooOO0(c34090OooO0oO.f122491OooOoO0, c34142OooO00o, oooO00o);
                c34182OooOO0.f122815OooO0o0 = c34090OooO0oO;
                c34182OooOO0.f122831OooO00o = new C34173OooO(c34090OooO0oO.f122488OooOo.f122484OooOo0o.f122362OooOo0o);
                obj2 = c34182OooOO0;
            } else {
                if (obj instanceof C34083OooO) {
                    C34083OooO c34083OooO2 = (C34083OooO) obj;
                    AbstractC34039OooOooO abstractC34039OooOooO2 = c34083OooO2.f122468OooOoOO;
                    int i7 = z ? 1 : 0;
                    ?? r3 = z;
                    while (i7 < abstractC34039OooOooO2.size()) {
                        InterfaceC34019OooO0oO interfaceC34019OooO0oOOooOo03 = abstractC34039OooOooO2.OooOo0(i7);
                        if (interfaceC34019OooO0oOOooOo03 instanceof C34100OooOOo0) {
                            c34100OooOOo0 = (C34100OooOOo0) interfaceC34019OooO0oOOooOo03;
                            i = i4;
                            c = c2;
                        } else if (interfaceC34019OooO0oOOooOo03 != null) {
                            AbstractC34039OooOooO abstractC34039OooOooOOooOOoo5 = AbstractC34039OooOooO.OooOOoo(interfaceC34019OooO0oOOooOo03);
                            c34100OooOOo0 = new C34100OooOOo0();
                            InterfaceC34019OooO0oO interfaceC34019OooO0oOOooOo04 = abstractC34039OooOooOOooOOoo5.OooOo0(r3);
                            if (interfaceC34019OooO0oOOooOo04 != null && !(interfaceC34019OooO0oOOooOo04 instanceof C34091OooO0oo)) {
                                if (!(interfaceC34019OooO0oOOooOo04 instanceof AbstractC34039OooOooO)) {
                                    if (!(interfaceC34019OooO0oOOooOo04 instanceof Oooo0)) {
                                        break loop0;
                                    }
                                    Oooo0 oooo03 = (Oooo0) interfaceC34019OooO0oOOooOo04;
                                    if (oooo03.f122380OooOoO0 != 0) {
                                        break loop0;
                                    }
                                    AbstractC34039OooOooO abstractC34039OooOooO3 = (AbstractC34039OooOooO) oooO00o2.OooO0o0(oooo03, r3);
                                    if (abstractC34039OooOooO3 != null) {
                                        AbstractC34039OooOooO abstractC34039OooOooOOooOOoo6 = AbstractC34039OooOooO.OooOOoo(abstractC34039OooOooO3);
                                        c34102OooOo00 = new C34102OooOo00();
                                        c34102OooOo00.f122516OooOo0o = AbstractC34033OooOo0o.OooOOo0(abstractC34039OooOooOOooOOoo6.OooOo0(r3));
                                        int size = abstractC34039OooOooOOooOOoo6.size();
                                        if (size == i4) {
                                            c = 2;
                                        } else {
                                            if (size != 2) {
                                                if (size != 3) {
                                                    throw new IllegalArgumentException("Invalid RecipientKeyIdentifier");
                                                }
                                                c34102OooOo00.f122515OooOo = C34025OooOOO0.OooOOoo(abstractC34039OooOooOOooOOoo6.OooOo0(1));
                                                c34102OooOo00.f122517OooOoO0 = C34095OooOOO.OooO0oo(abstractC34039OooOooOOooOOoo6.OooOo0(2));
                                            } else if (abstractC34039OooOooOOooOOoo6.OooOo0(1) instanceof C34025OooOOO0) {
                                                c34102OooOo00.f122515OooOo = C34025OooOOO0.OooOOoo(abstractC34039OooOooOOooOOoo6.OooOo0(1));
                                            } else {
                                                c = 2;
                                                c34102OooOo00.f122517OooOoO0 = C34095OooOOO.OooO0oo(abstractC34039OooOooOOooOOoo6.OooOo0(2));
                                            }
                                            c = 2;
                                        }
                                    } else {
                                        c = 2;
                                        c34102OooOo00 = null;
                                    }
                                    C34091OooO0oo c34091OooO0oo2 = new C34091OooO0oo();
                                    c34091OooO0oo2.f122493OooOo0o = null;
                                    c34091OooO0oo2.f122492OooOo = c34102OooOo00;
                                    c34091OooO0oo = c34091OooO0oo2;
                                } else {
                                    C34089OooO0o0 c34089OooO0o0OooO0oo3 = C34089OooO0o0.OooO0oo(interfaceC34019OooO0oOOooOo04);
                                    c34091OooO0oo = new C34091OooO0oo();
                                    c34091OooO0oo.f122493OooOo0o = c34089OooO0o0OooO0oo3;
                                    c34091OooO0oo.f122492OooOo = null;
                                    c = c2;
                                }
                            } else {
                                c = c2;
                                c34091OooO0oo = (C34091OooO0oo) interfaceC34019OooO0oOOooOo04;
                            }
                            c34100OooOOo0.f122513OooOo0o = c34091OooO0oo;
                            i = 1;
                            c34100OooOOo0.f122512OooOo = (AbstractC34033OooOo0o) abstractC34039OooOooOOooOOoo5.OooOo0(1);
                        } else {
                            i = i4;
                            c = c2;
                            c34100OooOOo0 = null;
                        }
                        C34091OooO0oo c34091OooO0oo3 = c34100OooOOo0.f122513OooOo0o;
                        C34089OooO0o0 c34089OooO0o0 = c34091OooO0oo3.f122493OooOo0o;
                        C34184OooOO0o c34184OooOO0o = c34089OooO0o0 != null ? new C34184OooOO0o(c34089OooO0o0.f122487OooOo0o, c34089OooO0o0.f122486OooOo.OooOOo(), null) : new C34184OooOO0o(null, null, c34091OooO0oo3.f122492OooOo.f122516OooOo0o.f122362OooOo0o);
                        C34186OooOOO0 c34186OooOOO0 = new C34186OooOOO0(c34083OooO2.f122466OooOoO, c34142OooO00o, oooO00o);
                        c34186OooOOO0.f122819OooO0o0 = c34083OooO2;
                        c34186OooOOO0.f122831OooO00o = c34184OooOO0o;
                        c34186OooOOO0.f122818OooO0o = c34100OooOOo0.f122512OooOo;
                        arrayList.add(c34186OooOOO0);
                        i7++;
                        c2 = c;
                        i4 = i;
                        r3 = 0;
                    }
                } else if (obj instanceof C34098OooOOOo) {
                    C34098OooOOOo c34098OooOOOo2 = (C34098OooOOOo) obj;
                    C34189OooOOo c34189OooOOo = new C34189OooOOo(c34098OooOOOo2.f122510OooOoO0, c34142OooO00o, oooO00o);
                    c34189OooOOo.f122828OooO0o0 = c34098OooOOOo2;
                    c34189OooOOo.f122831OooO00o = new C34190OooOOo0();
                    arrayList.add(c34189OooOOo);
                }
                i3++;
                z = false;
            }
            arrayList.add(obj2);
            i3++;
            z = false;
        }
    }
}
