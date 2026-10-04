package oO0OoO;

import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import oO0OO00.C32887OooO0oo;
import oO0OO00.C32889OooOOOo;
import oO0OO00.C32890OooOOo;
import oO0OO00.OooO00o;
import oO0OO00.OooOO0O;
import oO0OO00.OooOo00;
import oO0OOOO0.AbstractC32954OooO0oo;
import oO0OOOO0.OooO0o;
import oO0OoO00.C33258OooO00o;
import oO0OooO0.C33477OooO0OO;
import oO0o0O0o.C33595OooOOo;

/* JADX INFO: renamed from: oO0OoO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33227OooO00o extends C33258OooO00o {

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final C33227OooO00o f120239OooOOO0;

    static {
        OooO0o oooO0o = new OooO0o();
        oO0OO0O.OooO0O0.OooO00o(oooO0o);
        AbstractC32954OooO0oo.C32956OooO0o0<OooOO0O, Integer> packageFqName = oO0OO0O.OooO0O0.f118558OooO00o;
        OooOOO0.OooO0o(packageFqName, "packageFqName");
        AbstractC32954OooO0oo.C32956OooO0o0<oO0OO00.OooO0OO, List<oO0OO00.OooO00o>> constructorAnnotation = oO0OO0O.OooO0O0.f118560OooO0OO;
        OooOOO0.OooO0o(constructorAnnotation, "constructorAnnotation");
        AbstractC32954OooO0oo.C32956OooO0o0<oO0OO00.OooO0O0, List<oO0OO00.OooO00o>> classAnnotation = oO0OO0O.OooO0O0.f118559OooO0O0;
        OooOOO0.OooO0o(classAnnotation, "classAnnotation");
        AbstractC32954OooO0oo.C32956OooO0o0<C32887OooO0oo, List<oO0OO00.OooO00o>> functionAnnotation = oO0OO0O.OooO0O0.f118561OooO0Oo;
        OooOOO0.OooO0o(functionAnnotation, "functionAnnotation");
        AbstractC32954OooO0oo.C32956OooO0o0<oO0OO00.OooOOO0, List<oO0OO00.OooO00o>> propertyAnnotation = oO0OO0O.OooO0O0.f118563OooO0o0;
        OooOOO0.OooO0o(propertyAnnotation, "propertyAnnotation");
        AbstractC32954OooO0oo.C32956OooO0o0<oO0OO00.OooOOO0, List<oO0OO00.OooO00o>> propertyGetterAnnotation = oO0OO0O.OooO0O0.f118562OooO0o;
        OooOOO0.OooO0o(propertyGetterAnnotation, "propertyGetterAnnotation");
        AbstractC32954OooO0oo.C32956OooO0o0<oO0OO00.OooOOO0, List<oO0OO00.OooO00o>> propertySetterAnnotation = oO0OO0O.OooO0O0.f118564OooO0oO;
        OooOOO0.OooO0o(propertySetterAnnotation, "propertySetterAnnotation");
        AbstractC32954OooO0oo.C32956OooO0o0<oO0OO00.OooO0o, List<oO0OO00.OooO00o>> enumEntryAnnotation = oO0OO0O.OooO0O0.f118557OooO;
        OooOOO0.OooO0o(enumEntryAnnotation, "enumEntryAnnotation");
        AbstractC32954OooO0oo.C32956OooO0o0<oO0OO00.OooOOO0, OooO00o.OooO0O0.OooO0OO> compileTimeValue = oO0OO0O.OooO0O0.f118565OooO0oo;
        OooOOO0.OooO0o(compileTimeValue, "compileTimeValue");
        AbstractC32954OooO0oo.C32956OooO0o0<OooOo00, List<oO0OO00.OooO00o>> parameterAnnotation = oO0OO0O.OooO0O0.f118566OooOO0;
        OooOOO0.OooO0o(parameterAnnotation, "parameterAnnotation");
        AbstractC32954OooO0oo.C32956OooO0o0<C32889OooOOOo, List<oO0OO00.OooO00o>> typeAnnotation = oO0OO0O.OooO0O0.f118567OooOO0O;
        OooOOO0.OooO0o(typeAnnotation, "typeAnnotation");
        AbstractC32954OooO0oo.C32956OooO0o0<C32890OooOOo, List<oO0OO00.OooO00o>> typeParameterAnnotation = oO0OO0O.OooO0O0.f118568OooOO0o;
        OooOOO0.OooO0o(typeParameterAnnotation, "typeParameterAnnotation");
        f120239OooOOO0 = new C33227OooO00o(oooO0o, packageFqName, constructorAnnotation, classAnnotation, functionAnnotation, propertyAnnotation, propertyGetterAnnotation, propertySetterAnnotation, enumEntryAnnotation, compileTimeValue, parameterAnnotation, typeAnnotation, typeParameterAnnotation);
    }

    public static String OooO00o(C33477OooO0OO fqName) {
        String strOooO0O0;
        OooOOO0.OooO0oO(fqName, "fqName");
        StringBuilder sb = new StringBuilder();
        sb.append(C33595OooOOo.OooOo0(fqName.OooO0O0(), FilenameUtils.EXTENSION_SEPARATOR, IOUtils.DIR_SEPARATOR_UNIX));
        sb.append(IOUtils.DIR_SEPARATOR_UNIX);
        if (fqName.OooO0Oo()) {
            strOooO0O0 = "default-package";
        } else {
            strOooO0O0 = fqName.OooO0o().OooO0O0();
            OooOOO0.OooO0o(strOooO0O0, "fqName.shortName().asString()");
        }
        sb.append(strOooO0O0.concat(".kotlin_builtins"));
        return sb.toString();
    }
}
