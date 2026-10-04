package oO0OoO0;

import java.util.List;
import oO0OO00.C32890OooOOo;
import oO0OO0Oo.AbstractC32916OooO00o;
import oO0OO0Oo.C32922OooO0oO;
import oO0OO0Oo.C32923OooO0oo;
import oO0OO0Oo.InterfaceC32918OooO0OO;
import ooo0o.C35193OooOO0o;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOOO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final C33245OooOo0O f120288OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C33239OooOO0o f120289OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC32918OooO0OO f120290OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final oO0O0OO.OooOO0O f120291OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C32922OooO0oO f120292OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final AbstractC32916OooO00o f120293OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C32923OooO0oo f120294OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C35193OooOO0o f120295OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C33255Oooo00o f120296OooO0oo;

    /* JADX WARN: Removed duplicated region for block: B:8:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OooOOO(C33239OooOO0o components, InterfaceC32918OooO0OO nameResolver, oO0O0OO.OooOO0O containingDeclaration, C32922OooO0oO c32922OooO0oO, C32923OooO0oo versionRequirementTable, AbstractC32916OooO00o metadataVersion, C35193OooOO0o c35193OooOO0o, C33255Oooo00o c33255Oooo00o, List typeParameters) {
        String str;
        kotlin.jvm.internal.OooOOO0.OooO0oO(components, "components");
        kotlin.jvm.internal.OooOOO0.OooO0oO(nameResolver, "nameResolver");
        kotlin.jvm.internal.OooOOO0.OooO0oO(containingDeclaration, "containingDeclaration");
        kotlin.jvm.internal.OooOOO0.OooO0oO(versionRequirementTable, "versionRequirementTable");
        kotlin.jvm.internal.OooOOO0.OooO0oO(metadataVersion, "metadataVersion");
        kotlin.jvm.internal.OooOOO0.OooO0oO(typeParameters, "typeParameters");
        this.f120289OooO00o = components;
        this.f120290OooO0O0 = nameResolver;
        this.f120291OooO0OO = containingDeclaration;
        this.f120292OooO0Oo = c32922OooO0oO;
        this.f120294OooO0o0 = versionRequirementTable;
        this.f120293OooO0o = metadataVersion;
        this.f120295OooO0oO = c35193OooOO0o;
        String str2 = "Deserializer for \"" + containingDeclaration.getName() + '\"';
        if (c35193OooOO0o != null) {
            str = "Class '" + c35193OooOO0o.OooO0O0().OooO0O0().OooO0O0() + '\'';
            str = str == null ? "[container not found]" : str;
        }
        this.f120296OooO0oo = new C33255Oooo00o(this, c33255Oooo00o, typeParameters, str2, str);
        this.f120288OooO = new C33245OooOo0O(this);
    }

    public final OooOOO OooO00o(oO0O0OO.OooOO0O oooOO0O, List<C32890OooOOo> typeParameterProtos, InterfaceC32918OooO0OO nameResolver, C32922OooO0oO c32922OooO0oO, C32923OooO0oo versionRequirementTable, AbstractC32916OooO00o metadataVersion) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(typeParameterProtos, "typeParameterProtos");
        kotlin.jvm.internal.OooOOO0.OooO0oO(nameResolver, "nameResolver");
        kotlin.jvm.internal.OooOOO0.OooO0oO(versionRequirementTable, "versionRequirementTable");
        kotlin.jvm.internal.OooOOO0.OooO0oO(metadataVersion, "metadataVersion");
        int i = metadataVersion.f118753OooO0O0;
        if ((i != 1 || metadataVersion.f118754OooO0OO < 4) && i <= 1) {
            versionRequirementTable = this.f120294OooO0o0;
        }
        return new OooOOO(this.f120289OooO00o, nameResolver, oooOO0O, c32922OooO0oO, versionRequirementTable, metadataVersion, this.f120295OooO0oO, this.f120296OooO0oo, typeParameterProtos);
    }
}
