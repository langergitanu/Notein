package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class mwm implements ven {

    /* JADX INFO: renamed from: k4 */
    private final String f47450k4;

    /* JADX INFO: renamed from: x1 */
    private final String f47451x1;

    public mwm(String str, String str2) {
        this.f47450k4 = str;
        this.f47451x1 = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007e A[RETURN] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private List<String> m67755k4(IAutoShape iAutoShape, XamlOptions xamlOptions) {
        wdc wdcVarM71232k4;
        List<String> list = new List<>();
        int shapeType = iAutoShape.getShapeType();
        if (shapeType != 5) {
            if (shapeType == 35) {
                wdcVarM71232k4 = tii.m71230k4(iAutoShape, xamlOptions);
            }
            if (!C14113y2.m67411k4(iAutoShape.getTextFrame().getText())) {
                return list;
            }
            list.addItem(tii.m71233k4(iAutoShape, xamlOptions, this.f47450k4).toString());
            IGenericEnumerator<IParagraph> it = iAutoShape.getTextFrame().getParagraphs().iterator();
            while (it.hasNext()) {
                try {
                    list.addItem(tii.m71231k4(it.next(), xamlOptions).toString());
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            list.addItem(this.f47451x1);
            return list;
        }
        wdcVarM71232k4 = tii.m71232k4((IShape) iAutoShape, xamlOptions);
        list.addItem(wdcVarM71232k4.toString());
        if (!C14113y2.m67411k4(iAutoShape.getTextFrame().getText())) {
        }
    }

    /* JADX INFO: renamed from: k4 */
    private List<String> m67756k4(IConnector iConnector, XamlOptions xamlOptions) {
        wdc wdcVarM71236x1;
        List<String> list = new List<>();
        int shapeType = iConnector.getShapeType();
        if (shapeType == 1) {
            wdcVarM71236x1 = tii.m71236x1(iConnector, xamlOptions);
        } else {
            if (shapeType != 5) {
                return list;
            }
            wdcVarM71236x1 = tii.m71232k4(iConnector, xamlOptions);
        }
        list.addItem(wdcVarM71236x1.toString());
        return list;
    }

    /* JADX INFO: renamed from: k4 */
    private List<String> m67757k4(IGroupShape iGroupShape, XamlOptions xamlOptions, Dictionary<String, byte[]>[] dictionaryArr) {
        String string;
        List<String> list = new List<>();
        Dictionary dictionary = new Dictionary();
        IGenericEnumerator<IShape> it = iGroupShape.getShapes().iterator();
        while (it.hasNext()) {
            try {
                IShape next = it.next();
                if (C7019kk.m27469x1(next, IAutoShape.class)) {
                    IAutoShape iAutoShape = (IAutoShape) C7019kk.m27452k4((Object) next, IAutoShape.class);
                    if (iAutoShape.getShapeType() == 5) {
                        string = tii.m71232k4((IShape) iAutoShape, xamlOptions).toString();
                    } else if (iAutoShape.getShapeType() == 1) {
                        string = tii.m71236x1(iAutoShape, xamlOptions).toString();
                    } else if (iAutoShape.getShapeType() == 35) {
                        string = tii.m71230k4(iAutoShape, xamlOptions).toString();
                    } else {
                        if (iAutoShape.getShapeType() == 0) {
                            InterfaceC13773le interfaceC13773leM71228k4 = tii.m71228k4(xamlOptions);
                            list.addItem(interfaceC13773leM71228k4.mo6391k4(iAutoShape, xamlOptions));
                            KeyValuePair keyValuePair = new KeyValuePair(interfaceC13773leM71228k4.mo6396x1(), interfaceC13773leM71228k4.mo6392k4());
                            dictionary.addItem(keyValuePair.getKey(), keyValuePair.getValue());
                        }
                        list.addRange(m67755k4(iAutoShape, xamlOptions));
                    }
                    list.addItem(string);
                    list.addRange(m67755k4(iAutoShape, xamlOptions));
                }
                if (C7019kk.m27469x1(next, IConnector.class)) {
                    list.addRange(m67756k4((IConnector) C7019kk.m27452k4((Object) next, IConnector.class), xamlOptions));
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        dictionaryArr[0] = dictionary;
        return list;
    }

    @Override // com.aspose.slides.ven
    /* JADX INFO: renamed from: k4 */
    public final List<String> mo67761k4(ILayoutSlide iLayoutSlide, XamlOptions xamlOptions) {
        String string;
        List<String> list = new List<>();
        IGenericEnumerator<IShape> it = iLayoutSlide.getShapes().iterator();
        while (it.hasNext()) {
            try {
                IShape next = it.next();
                if (C7019kk.m27469x1(next, IAutoShape.class)) {
                    IAutoShape iAutoShape = (IAutoShape) C7019kk.m27452k4((Object) next, IAutoShape.class);
                    int shapeType = iAutoShape.getShapeType();
                    if (shapeType == 1) {
                        string = tii.m71236x1(iAutoShape, xamlOptions).toString();
                    } else if (shapeType == 5) {
                        string = tii.m71232k4((IShape) iAutoShape, xamlOptions).toString();
                    } else if (shapeType == 35) {
                        string = tii.m71230k4(iAutoShape, xamlOptions).toString();
                    }
                    list.addItem(string);
                }
                if (C7019kk.m27469x1(next, IConnector.class)) {
                    list.addRange(m67756k4((IConnector) C7019kk.m27452k4((Object) next, IConnector.class), xamlOptions));
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        return list;
    }

    @Override // com.aspose.slides.ven
    /* JADX INFO: renamed from: k4 */
    public final List<String> mo67762k4(IShape iShape, XamlOptions xamlOptions, Dictionary<String, byte[]>[] dictionaryArr) {
        Dictionary<String, byte[]> dictionary = new Dictionary<>();
        List<String> list = new List<>();
        if (C7019kk.m27469x1(iShape, IAutoShape.class)) {
            list = m67755k4((IAutoShape) C7019kk.m27452k4((Object) iShape, IAutoShape.class), xamlOptions);
        }
        if (C7019kk.m27469x1(iShape, IGroupShape.class)) {
            IGroupShape iGroupShape = (IGroupShape) C7019kk.m27452k4((Object) iShape, IGroupShape.class);
            Dictionary<String, byte[]>[] dictionaryArr2 = {new Dictionary()};
            list = m67757k4(iGroupShape, xamlOptions, dictionaryArr2);
            C14318pw.m69319k4(dictionaryArr2[0], dictionary);
        }
        if (C7019kk.m27469x1(iShape, IPictureFrame.class)) {
            IPictureFrame iPictureFrame = (IPictureFrame) C7019kk.m27452k4((Object) iShape, IPictureFrame.class);
            KeyValuePair<String, byte[]>[] keyValuePairArr = {new KeyValuePair()};
            String strM67759k4 = m67759k4(iPictureFrame, xamlOptions, keyValuePairArr);
            KeyValuePair<String, byte[]> keyValuePair = keyValuePairArr[0];
            if (!C14113y2.m67411k4(keyValuePair.getKey())) {
                dictionary.addItem(keyValuePair.getKey(), keyValuePair.getValue());
            }
            list.addItem(strM67759k4);
        }
        if (C7019kk.m27469x1(iShape, IConnector.class)) {
            list = m67756k4((IConnector) C7019kk.m27452k4((Object) iShape, IConnector.class), xamlOptions);
        }
        if (C7019kk.m27469x1(iShape, IChart.class)) {
            IChart iChart = (IChart) C7019kk.m27452k4((Object) iShape, IChart.class);
            KeyValuePair<String, byte[]>[] keyValuePairArr2 = {new KeyValuePair()};
            String strM67758k4 = m67758k4(iChart, xamlOptions, keyValuePairArr2);
            KeyValuePair<String, byte[]> keyValuePair2 = keyValuePairArr2[0];
            if (!C14113y2.m67411k4(keyValuePair2.getKey())) {
                dictionary.addItem(keyValuePair2.getKey(), keyValuePair2.getValue());
            }
            list.addItem(strM67758k4);
        }
        if (C7019kk.m27469x1(iShape, ITable.class)) {
            list.addItem(tii.m71233k4(iShape, xamlOptions, this.f47450k4).toString());
            ITable iTable = (ITable) C7019kk.m27452k4((Object) iShape, ITable.class);
            KeyValuePair<String, byte[]>[] keyValuePairArr3 = {new KeyValuePair()};
            String strM67760k4 = m67760k4(iTable, xamlOptions, keyValuePairArr3);
            KeyValuePair<String, byte[]> keyValuePair3 = keyValuePairArr3[0];
            if (!C14113y2.m67411k4(keyValuePair3.getKey())) {
                dictionary.addItem(keyValuePair3.getKey(), keyValuePair3.getValue());
            }
            list.addItem(strM67760k4);
            list.addItem(this.f47451x1);
        }
        dictionaryArr[0] = dictionary;
        return list;
    }

    /* JADX INFO: renamed from: k4 */
    private String m67758k4(IChart iChart, XamlOptions xamlOptions, KeyValuePair<String, byte[]>[] keyValuePairArr) {
        InterfaceC13773le interfaceC13773leM71234kk = tii.m71234kk(xamlOptions);
        String strMo6391k4 = interfaceC13773leM71234kk.mo6391k4(iChart, xamlOptions);
        new KeyValuePair(interfaceC13773leM71234kk.mo6396x1(), interfaceC13773leM71234kk.mo6392k4()).CloneTo((KeyValuePair) keyValuePairArr[0]);
        return strMo6391k4;
    }

    /* JADX INFO: renamed from: k4 */
    private String m67759k4(IPictureFrame iPictureFrame, XamlOptions xamlOptions, KeyValuePair<String, byte[]>[] keyValuePairArr) {
        InterfaceC14264p2 interfaceC14264p2M71229k4 = tii.m71229k4(iPictureFrame, xamlOptions);
        String string = interfaceC14264p2M71229k4.toString();
        if (interfaceC14264p2M71229k4.mo5283k4() == null || interfaceC14264p2M71229k4.mo5283k4().length <= 0) {
            keyValuePairArr[0] = new KeyValuePair<>();
            return string;
        }
        new KeyValuePair(interfaceC14264p2M71229k4.mo5287x1(), interfaceC14264p2M71229k4.mo5283k4()).CloneTo((KeyValuePair) keyValuePairArr[0]);
        return string;
    }

    /* JADX INFO: renamed from: k4 */
    private String m67760k4(ITable iTable, XamlOptions xamlOptions, KeyValuePair<String, byte[]>[] keyValuePairArr) {
        InterfaceC13773le interfaceC13773leM71235x1 = tii.m71235x1(xamlOptions);
        String strMo6391k4 = interfaceC13773leM71235x1.mo6391k4(iTable, xamlOptions);
        new KeyValuePair(C3141rv.m13412x1(xamlOptions.m3110rv(), interfaceC13773leM71235x1.mo6396x1()), interfaceC13773leM71235x1.mo6392k4()).CloneTo((KeyValuePair) keyValuePairArr[0]);
        return strMo6391k4;
    }
}
