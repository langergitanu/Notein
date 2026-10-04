package com.aspose.words;

import androidx.core.app.FrameMetricsAggregator;
import androidx.core.view.InputDeviceCompat;
import com.google.android.material.internal.ViewUtils;
import com.google.firebase.firestore.local.SQLitePersistence;
import com.google.logging.type.LogSeverity;

/* JADX INFO: loaded from: classes6.dex */
final class zzZSX {
    private zzZTN zzYJC;
    private zzZT8 zzYJv;
    private zzZT4 zzYJw;
    private ShapeBase zzZBi;

    public zzZSX(zzZTN zzztn) {
        this.zzYJC = zzztn;
    }

    private void zzE0(int i) {
        zzY("Unknown OfficeArt property found 0x{0:x4}, ignored.", Integer.valueOf(i));
    }

    private void zzE1(int i) {
        zzE0(i);
        com.aspose.words.internal.zzZKN.format("Unknown shape property id:{0}.", Integer.valueOf(i));
    }

    private zzZU0 zzE2(int i) {
        zzZTN zzztn = this.zzYJC;
        zzZD8 zzzd8 = zzztn.zzYKb;
        if (zzzd8 == null) {
            zzztn.zzTG("Invalid OfficeArt blip reference, ignored.");
            return null;
        }
        zzZTW zzztwZzEl = zzzd8.zzEl(i);
        if (zzztwZzEl != null) {
            return zzztwZzEl.zzZiJ();
        }
        this.zzYJC.zzTG("Invalid OfficeArt blip reference, ignored.");
        return null;
    }

    private void zzF(zzZT9 zzzt9) {
        int iZzZiG = zzzt9.zzZiG();
        switch (zzzt9.getId()) {
            case 1984:
            case 1985:
            case 1986:
            case 1987:
            case 1988:
            case 1989:
                this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                break;
            default:
                zzE1(zzzt9.getId());
                break;
        }
    }

    private void zzG(zzZT9 zzzt9) {
        int id = zzzt9.getId();
        if (id == 1983) {
            zzZ(this.zzZBi, 1981, zzzt9.zzZiG());
            zzZ(this.zzZBi, FieldType.FIELD_CITATION, zzzt9.zzZiG());
            zzZ(this.zzZBi, 1982, zzzt9.zzZiG());
            zzZ(this.zzZBi, 1983, zzzt9.zzZiG());
            return;
        }
        switch (id) {
            case 1921:
            case 1922:
            case 1923:
            case 1924:
            case 1925:
            case 1926:
            case 1927:
            case 1928:
                this.zzZBi.setShapeAttr(zzzt9.getId(), ((zzZSS) zzzt9).getValue());
                break;
            default:
                zzE1(zzzt9.getId());
                break;
        }
    }

    private void zzH(zzZT9 zzzt9) {
        int id = zzzt9.getId();
        if (id == 1792) {
            this.zzZBi.setShapeAttr(zzzt9.getId(), ((zzZTB) zzzt9).zzZik());
            return;
        }
        if (id != 1855) {
            zzE1(zzzt9.getId());
            return;
        }
        int iZzZiG = zzzt9.zzZiG();
        if ((524288 & iZzZiG) != 0) {
            this.zzZBi.setShapeAttr(1855, Boolean.valueOf((iZzZiG & 8) != 0));
        }
    }

    private void zzI(zzZT9 zzzt9) {
        int iZzZiG = zzzt9.zzZiG();
        int id = zzzt9.getId();
        if (id == 1728) {
            this.zzYJC.zzTG(com.aspose.words.internal.zzZKN.format("Unsupported OfficeArt property 0x{0:x4}, ignored.", Integer.valueOf(zzzt9.getId())));
        } else if (id != 1791) {
            zzE1(zzzt9.getId());
        } else {
            this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
        }
    }

    private void zzJ(zzZT9 zzzt9) throws Exception {
        int iZzZiG = zzzt9.zzZiG();
        int id = zzzt9.getId();
        if (id == 1280) {
            this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
            return;
        }
        if (id == 1281) {
            this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
            return;
        }
        if (id == 1343) {
            zzZ(this.zzZBi, 1340, iZzZiG);
            zzZ(this.zzZBi, 1341, iZzZiG);
            zzZ(this.zzZBi, 1342, iZzZiG);
            zzZ(this.zzZBi, 1343, iZzZiG);
            if ((iZzZiG & 1) != 0) {
                this.zzZBi.setWrapType(0);
                return;
            }
            return;
        }
        switch (id) {
            case 1284:
                zzJW[] zzjwArrZzZiT = ((zzZU1) zzzt9).zzZiT();
                if (zzjwArrZzZiT != null) {
                    this.zzZBi.setShapeAttr(zzzt9.getId(), zzjwArrZzZiT);
                }
                break;
            case 1285:
            case 1286:
            case 1287:
                this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                break;
            case 1288:
                int[] iArrZzZiN = ((zzZU1) zzzt9).zzZiN();
                if (iArrZzZiN != null) {
                    this.zzZBi.setShapeAttr(zzzt9.getId(), iArrZzZiN);
                }
                break;
            case 1289:
                this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                break;
            default:
                zzE1(zzzt9.getId());
                break;
        }
    }

    private void zzK(zzZT9 zzzt9) {
        int iZzZiG = zzzt9.zzZiG();
        if (zzzt9.getId() != 1087) {
            zzE1(zzzt9.getId());
        } else {
            this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
        }
    }

    private void zzL(zzZT9 zzzt9) throws Exception {
        int iZzZiG = zzzt9.zzZiG();
        int id = zzzt9.getId();
        if (id == 933) {
            this.zzYJC.zzTG(com.aspose.words.internal.zzZKN.format("Unsupported OfficeArt property 0x{0:x4}, ignored.", Integer.valueOf(zzzt9.getId())));
            return;
        }
        if (id == 959) {
            zzZ(this.zzZBi, 953, iZzZiG);
            zzZ(this.zzZBi, 954, iZzZiG);
            zzZ(this.zzZBi, 955, iZzZiG);
            zzZ(this.zzZBi, 956, iZzZiG);
            zzZ(this.zzZBi, 957, iZzZiG);
            zzZ(this.zzZBi, 958, iZzZiG);
            zzZ(this.zzZBi, 959, iZzZiG);
            zzZ(this.zzZBi, 944, iZzZiG);
            zzZ(this.zzZBi, 945, iZzZiG);
            zzZ(this.zzZBi, 946, iZzZiG);
            zzZ(this.zzZBi, 947, iZzZiG);
            zzZ(this.zzZBi, 948, iZzZiG);
            zzZ(this.zzZBi, 950, iZzZiG);
            zzZ(this.zzZBi, 951, iZzZiG);
            zzZ(this.zzZBi, 952, iZzZiG);
            return;
        }
        switch (id) {
            case 896:
            case 897:
                break;
            case 898:
                zzZTD zzztd = (zzZTD) zzzt9;
                this.zzZBi.setHRef(com.aspose.words.internal.zzZVR.zz5(zzztd.getAddress(), zzztd.getSubAddress()));
                if (com.aspose.words.internal.zzZYD.zzXk(zzztd.getTarget())) {
                    this.zzZBi.setTarget(zzztd.getTarget());
                    return;
                }
                return;
            case 899:
                zzYM5[] zzym5ArrZzZiS = ((zzZU1) zzzt9).zzZiS();
                if (zzym5ArrZzZiS != null) {
                    this.zzZBi.setShapeAttr(zzzt9.getId(), zzym5ArrZzZiS);
                    return;
                }
                return;
            case SQLitePersistence.MAX_ARGS /* 900 */:
            case 901:
            case 902:
            case 903:
                this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                return;
            case 904:
                return;
            default:
                switch (id) {
                    case 909:
                    case 910:
                    case 919:
                        break;
                    case 911:
                        this.zzZBi.setHorizontalAlignment(iZzZiG);
                        return;
                    case 912:
                        this.zzZBi.setRelativeHorizontalPosition(iZzZiG);
                        return;
                    case 913:
                        this.zzZBi.setVerticalAlignment(iZzZiG);
                        return;
                    case 914:
                        this.zzZBi.setRelativeVerticalPosition(iZzZiG);
                        return;
                    case 915:
                        this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                        return;
                    case 916:
                        this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                        return;
                    case 917:
                        this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                        return;
                    case 918:
                        return;
                    case 920:
                        this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                        return;
                    default:
                        switch (id) {
                            case 922:
                                break;
                            case 923:
                            case 924:
                            case 925:
                            case 926:
                                this.zzZBi.setShapeAttr(zzzt9.getId(), zzY0E.zzhI(iZzZiG));
                                break;
                            case 927:
                            case 928:
                                this.zzYJC.zzTG(com.aspose.words.internal.zzZKN.format("Unsupported OfficeArt property 0x{0:x4}, ignored.", Integer.valueOf(zzzt9.getId())));
                                break;
                            default:
                                switch (id) {
                                    case 937:
                                        this.zzYJC.zzTG(com.aspose.words.internal.zzZKN.format("Unsupported OfficeArt property 0x{0:x4}, ignored.", Integer.valueOf(zzzt9.getId())));
                                        break;
                                    case 938:
                                        this.zzYJC.zzTG(com.aspose.words.internal.zzZKN.format("Unsupported OfficeArt property 0x{0:x4}, ignored.", Integer.valueOf(zzzt9.getId())));
                                        break;
                                    case 939:
                                        zzY("Unknown OfficeArt property found 0x{0:x4}, ignored.", 939);
                                        break;
                                    default:
                                        zzE1(zzzt9.getId());
                                        break;
                                }
                                break;
                        }
                        return;
                }
                break;
        }
        this.zzZBi.setShapeAttr(zzzt9.getId(), ((zzZSS) zzzt9).getValue());
    }

    private void zzM(zzZT9 zzzt9) {
        int iZzZiG = zzzt9.zzZiG();
        int id = zzzt9.getId();
        if (id == 895) {
            zzZ(this.zzZBi, 889, iZzZiG);
            zzZ(this.zzZBi, 890, iZzZiG);
            zzZ(this.zzZBi, 891, iZzZiG);
            zzZ(this.zzZBi, 892, iZzZiG);
            zzZ(this.zzZBi, 893, iZzZiG);
            zzZ(this.zzZBi, 894, iZzZiG);
            zzZ(this.zzZBi, 895, iZzZiG);
            return;
        }
        switch (id) {
            case 832:
                this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                break;
            case 833:
            case 836:
            case 837:
                this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                break;
            case 834:
                this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                break;
            case 835:
                this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                break;
            default:
                zzE1(zzzt9.getId());
                break;
        }
    }

    private static boolean zzMw(String str) {
        return com.aspose.words.internal.zzZVR.zzWE(str) || com.aspose.words.internal.zzZVR.zzWA(str) || com.aspose.words.internal.zzZVR.zzWF(str);
    }

    private void zzN(zzZT9 zzzt9) {
        int iZzZiG = zzzt9.zzZiG();
        int id = zzzt9.getId();
        if (id == 831) {
            zzZ(this.zzZBi, 826, iZzZiG);
            zzZ(this.zzZBi, 827, iZzZiG);
            zzZ(this.zzZBi, 828, iZzZiG);
            zzZ(this.zzZBi, 830, iZzZiG);
            return;
        }
        switch (id) {
            case 769:
                if (iZzZiG != 0) {
                    this.zzYJC.zzMx(com.aspose.words.internal.zzZKN.format("Unsupported OfficeArt property 0x{0:x4}, ignored.", Integer.valueOf(zzzt9.getId())));
                    if (this.zzZBi.getShapeType() == 100 && !this.zzYJw.zzZia() && !this.zzYJC.zzYK8.containsKey(Integer.valueOf(this.zzZBi.getId()))) {
                        com.aspose.words.internal.zzZQF.zzY(this.zzYJC.zzYK8, Integer.valueOf(this.zzZBi.getId()), Integer.valueOf(iZzZiG));
                        break;
                    }
                }
                break;
            case 770:
            case 775:
                zzE0(zzzt9.getId());
                break;
            case 771:
                this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                break;
            case 772:
            case 773:
            case 774:
                this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                break;
            default:
                switch (id) {
                    case 777:
                        this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                        break;
                    case 778:
                        this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                        break;
                    case 779:
                        this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                        break;
                    case 780:
                        this.zzZBi.setShapeAttr(zzzt9.getId(), ((zzZSO) zzzt9).zzZi2());
                        break;
                    default:
                        zzE1(zzzt9.getId());
                        break;
                }
                break;
        }
    }

    private void zzO(zzZT9 zzzt9) {
        int iZzZiG = zzzt9.zzZiG();
        int id = zzzt9.getId();
        if (id == 767) {
            zzZ(this.zzZBi, 763, iZzZiG);
            zzZ(this.zzZBi, 764, iZzZiG);
            zzZ(this.zzZBi, 765, iZzZiG);
            zzZ(this.zzZBi, 766, iZzZiG);
            zzZ(this.zzZBi, 767, iZzZiG);
            return;
        }
        switch (id) {
            case 704:
            case 705:
            case 706:
            case 707:
            case 708:
            case 709:
            case 710:
            case 711:
            case 712:
            case 714:
            case 715:
            case 716:
            case 717:
            case 718:
            case 719:
            case 720:
            case 721:
            case 722:
            case 723:
            case 724:
            case 725:
            case 726:
            case 727:
            case 728:
            case 729:
            case 730:
                this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                break;
            case 713:
                this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                break;
            case 731:
                zzE0(zzzt9.getId());
                break;
            default:
                zzE1(zzzt9.getId());
                break;
        }
    }

    private void zzP(zzZT9 zzzt9) {
        int iZzZiG = zzzt9.zzZiG();
        int id = zzzt9.getId();
        if (id == 703) {
            zzZ(this.zzZBi, LogSeverity.ALERT_VALUE, iZzZiG);
            zzZ(this.zzZBi, 701, iZzZiG);
            zzZ(this.zzZBi, 702, iZzZiG);
            zzZ(this.zzZBi, 703, iZzZiG);
            return;
        }
        switch (id) {
            case 640:
            case 641:
            case 642:
            case 643:
            case 644:
            case 645:
                this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                break;
            case 646:
                this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                break;
            case 647:
                this.zzZBi.setShapeAttr(zzzt9.getId(), zzY0E.zzhI(iZzZiG));
                break;
            case 648:
                this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                break;
            case 649:
            case 650:
            case 651:
            case 653:
                this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                break;
            case 652:
            case 663:
            case 666:
                this.zzYJC.zzTG(com.aspose.words.internal.zzZKN.format("Unknown OfficeArt property found 0x{0:x4}, ignored.", Integer.valueOf(zzzt9.getId())));
                break;
            case 654:
            case 655:
            case 656:
            case 657:
            case 658:
            case 659:
            case 660:
            case 661:
            case 662:
            case 664:
            case 665:
                zzE0(zzzt9.getId());
                break;
            default:
                zzE1(zzzt9.getId());
                break;
        }
    }

    private void zzQ(zzZT9 zzzt9) {
        int iZzZiG = zzzt9.zzZiG();
        int id = zzzt9.getId();
        if (id == 639) {
            zzZ(this.zzZBi, 639, iZzZiG);
            return;
        }
        switch (id) {
            case 576:
                this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                break;
            case 577:
            case 578:
            case 579:
            case 580:
            case 581:
            case 582:
            case 583:
            case 584:
            case 585:
            case 586:
            case 587:
                this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                break;
            default:
                zzE1(zzzt9.getId());
                break;
        }
    }

    private void zzR(zzZT9 zzzt9) {
        int iZzZiG = zzzt9.zzZiG();
        int id = zzzt9.getId();
        if (id == 575) {
            zzZ(this.zzZBi, 574, iZzZiG);
            zzZ(this.zzZBi, 575, iZzZiG);
            return;
        }
        switch (id) {
            case 512:
                this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                break;
            case InputDeviceCompat.SOURCE_DPAD /* 513 */:
            case 514:
                this.zzZBi.setShapeAttr(zzzt9.getId(), zzY0E.zzhI(iZzZiG));
                break;
            case 515:
            case 516:
            case 517:
            case 518:
            case 519:
            case 520:
            case 521:
            case 522:
            case 523:
            case 524:
            case 525:
            case 526:
            case 527:
            case 528:
            case 529:
                this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                break;
            case 530:
            case 531:
            case 532:
            case 534:
            case 535:
            case 536:
            case 538:
            case 539:
                this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                break;
            case 533:
            case 537:
                this.zzYJC.zzTG(com.aspose.words.internal.zzZKN.format("Unknown OfficeArt property found 0x{0:x4}, ignored.", Integer.valueOf(zzzt9.getId())));
                break;
            case 540:
                this.zzYJC.zzTG(com.aspose.words.internal.zzZKN.format("Unsupported OfficeArt property 0x{0:x4}, ignored.", Integer.valueOf(zzzt9.getId())));
                break;
            default:
                zzE1(zzzt9.getId());
                break;
        }
    }

    private void zzS(zzZT9 zzzt9) throws Exception {
        int iZzZiG = zzzt9.zzZiG();
        int id = zzzt9.getId();
        if (id == 442) {
            this.zzYJC.zzTG(com.aspose.words.internal.zzZKN.format("Unsupported OfficeArt property 0x{0:x4}, ignored.", Integer.valueOf(zzzt9.getId())));
            return;
        }
        if (id == 447) {
            zzZ(this.zzZBi, 443, iZzZiG);
            zzZ(this.zzZBi, 444, iZzZiG);
            zzZ(this.zzZBi, 445, iZzZiG);
            zzZ(this.zzZBi, 446, iZzZiG);
            zzZ(this.zzZBi, 447, iZzZiG);
            zzZ(this.zzZBi, 441, iZzZiG);
            zzZ(this.zzZBi, 442, iZzZiG);
            return;
        }
        switch (id) {
            case 384:
                this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                break;
            case 385:
            case 387:
                this.zzZBi.setShapeAttr(zzzt9.getId(), zzY0E.zzhI(iZzZiG));
                break;
            case 386:
            case 388:
            case 389:
                this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                break;
            case 390:
                zzZU0 zzzu0ZzE2 = zzE2(iZzZiG);
                if (zzzu0ZzE2 != null) {
                    this.zzZBi.setShapeAttr(4110, zzzu0ZzE2.getImageBytes());
                    this.zzZBi.setShapeAttr(EditingLanguage.CROATIAN_BOZNIA_AND_HERZEGOVINA, Integer.valueOf(zzzu0ZzE2.getPresetTexture()));
                }
                break;
            case 391:
                this.zzZBi.setShapeAttr(391, ((zzZSS) zzzt9).getValue());
                break;
            case 392:
                this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                break;
            case 393:
            case 394:
            case 395:
            case 396:
            case 397:
            case 398:
            case 399:
            case 400:
            case 401:
            case 402:
            case 403:
            case 404:
                this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                break;
            case 405:
                this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                break;
            case 406:
                this.zzYJC.zzTG(com.aspose.words.internal.zzZKN.format("Unsupported OfficeArt property 0x{0:x4}, ignored.", Integer.valueOf(zzzt9.getId())));
                break;
            case 407:
                zzZLE[] zzzleArrZzZiU = ((zzZU1) zzzt9).zzZiU();
                if (zzzleArrZzZiU != null) {
                    this.zzZBi.setShapeAttr(zzzt9.getId(), zzzleArrZzZiU);
                }
                break;
            case 408:
            case 409:
            case 410:
            case 411:
                this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                break;
            case 412:
                this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                break;
            default:
                switch (id) {
                    case 414:
                    case 418:
                        if (iZzZiG != -1) {
                            this.zzZBi.setShapeAttr(zzzt9.getId(), zzY0E.zzhI(iZzZiG));
                        }
                        break;
                    case 415:
                    case 419:
                    case 421:
                    case 422:
                    case 423:
                        this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                        break;
                    case 416:
                    case 420:
                        this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(zzY0E.zzhH(iZzZiG)));
                        break;
                    case 417:
                        this.zzYJC.zzTG(com.aspose.words.internal.zzZKN.format("Unsupported OfficeArt property 0x{0:x4}, ignored.", Integer.valueOf(zzzt9.getId())));
                        break;
                    default:
                        zzE1(zzzt9.getId());
                        break;
                }
                break;
        }
    }

    private void zzT(zzZT9 zzzt9) throws Exception {
        zzZL3[] zzzl3ArrZzZiR;
        zzZLU[] zzzluArrZzZiP;
        int iZzZiG = zzzt9.zzZiG();
        int id = zzzt9.getId();
        if (id == 377) {
            this.zzYJC.zzTG(com.aspose.words.internal.zzZKN.format("Unsupported OfficeArt property 0x{0:x4}, ignored.", Integer.valueOf(zzzt9.getId())));
            return;
        }
        if (id == 383) {
            zzZ(this.zzZBi, StyleIdentifier.length, iZzZiG);
            zzZ(this.zzZBi, 379, iZzZiG);
            zzZ(this.zzZBi, 380, iZzZiG);
            zzZ(this.zzZBi, 381, iZzZiG);
            zzZ(this.zzZBi, 382, iZzZiG);
            zzZ(this.zzZBi, 383, iZzZiG);
            return;
        }
        switch (id) {
            case StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_6 /* 320 */:
                if (!this.zzZBi.isGroup()) {
                    this.zzZBi.zzHw(iZzZiG);
                }
                break;
            case StyleIdentifier.GRID_TABLE_7_COLORFUL_ACCENT_6 /* 321 */:
                if (!this.zzZBi.isGroup()) {
                    this.zzZBi.zzHv(iZzZiG);
                }
                break;
            case StyleIdentifier.LIST_TABLE_1_LIGHT /* 322 */:
                if (!this.zzZBi.isGroup()) {
                    ShapeBase shapeBase = this.zzZBi;
                    shapeBase.zzHD(iZzZiG - shapeBase.zzY9h().zzZyh());
                }
                break;
            case StyleIdentifier.LIST_TABLE_2 /* 323 */:
                if (!this.zzZBi.isGroup()) {
                    ShapeBase shapeBase2 = this.zzZBi;
                    shapeBase2.zzHC(iZzZiG - shapeBase2.zzY9h().zzZyg());
                }
                break;
            case StyleIdentifier.LIST_TABLE_3 /* 324 */:
                this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                break;
            case StyleIdentifier.LIST_TABLE_4 /* 325 */:
                zzYM5[] zzym5ArrZzZiS = ((zzZU1) zzzt9).zzZiS();
                if (zzym5ArrZzZiS != null) {
                    this.zzZBi.setShapeAttr(zzzt9.getId(), zzym5ArrZzZiS);
                }
                break;
            case StyleIdentifier.LIST_TABLE_5_DARK /* 326 */:
                zzYM6[] zzym6ArrZzZiO = ((zzZU1) zzzt9).zzZiO();
                if (zzym6ArrZzZiO != null) {
                    this.zzZBi.setShapeAttr(zzzt9.getId(), zzym6ArrZzZiO);
                }
                break;
            case StyleIdentifier.LIST_TABLE_6_COLORFUL /* 327 */:
            case StyleIdentifier.LIST_TABLE_7_COLORFUL /* 328 */:
            case StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_1 /* 329 */:
            case StyleIdentifier.LIST_TABLE_2_ACCENT_1 /* 330 */:
            case StyleIdentifier.LIST_TABLE_3_ACCENT_1 /* 331 */:
            case StyleIdentifier.LIST_TABLE_4_ACCENT_1 /* 332 */:
            case StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_1 /* 333 */:
            case StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_1 /* 334 */:
            case StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_1 /* 335 */:
            case StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_2 /* 336 */:
                this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                break;
            case StyleIdentifier.LIST_TABLE_2_ACCENT_2 /* 337 */:
                zzYM5[] zzym5ArrZzZiS2 = ((zzZU1) zzzt9).zzZiS();
                if (zzym5ArrZzZiS2 != null) {
                    this.zzZBi.setShapeAttr(zzzt9.getId(), zzym5ArrZzZiS2);
                }
                break;
            case StyleIdentifier.LIST_TABLE_3_ACCENT_2 /* 338 */:
                int[] iArrZzZiN = ((zzZU1) zzzt9).zzZiN();
                if (iArrZzZiN != null) {
                    this.zzZBi.setShapeAttr(zzzt9.getId(), iArrZzZiN);
                }
                break;
            case StyleIdentifier.LIST_TABLE_4_ACCENT_2 /* 339 */:
            case StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_2 /* 340 */:
                this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                break;
            case StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_2 /* 341 */:
                zzZU1 zzzu1 = (zzZU1) com.aspose.words.internal.zzZKW.zzZ(zzzt9, zzZU1.class);
                if (zzzu1 != null && (zzzl3ArrZzZiR = zzzu1.zzZiR()) != null) {
                    this.zzZBi.setShapeAttr(zzzt9.getId(), zzzl3ArrZzZiR);
                    break;
                }
                break;
            case StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_2 /* 342 */:
                zzZU1 zzzu12 = (zzZU1) com.aspose.words.internal.zzZKW.zzZ(zzzt9, zzZU1.class);
                if (zzzu12 != null && (zzzluArrZzZiP = zzzu12.zzZiP()) != null) {
                    this.zzZBi.setShapeAttr(zzzt9.getId(), zzzluArrZzZiP);
                    break;
                }
                break;
            case StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_3 /* 343 */:
                this.zzZBi.setShapeAttr(zzzt9.getId(), ((zzZU1) zzzt9).zzZiQ());
                break;
            case StyleIdentifier.LIST_TABLE_2_ACCENT_3 /* 344 */:
                this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                break;
            default:
                zzE1(zzzt9.getId());
                break;
        }
    }

    private void zzU(zzZT9 zzzt9) throws Exception {
        int i;
        int iZzZiG = zzzt9.zzZiG();
        int id = zzzt9.getId();
        if (id == 319) {
            zzZ(this.zzZBi, StyleIdentifier.GRID_TABLE_2_ACCENT_6, iZzZiG);
            zzZ(this.zzZBi, StyleIdentifier.GRID_TABLE_3_ACCENT_6, iZzZiG);
            zzZ(this.zzZBi, StyleIdentifier.GRID_TABLE_4_ACCENT_6, iZzZiG);
            zzZ(this.zzZBi, StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_6, iZzZiG);
            zzZ(this.zzZBi, StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_5, iZzZiG);
            return;
        }
        switch (id) {
            case 256:
            case 257:
            case StyleIdentifier.COLORFUL_LIST_ACCENT_6 /* 258 */:
            case StyleIdentifier.COLORFUL_GRID_ACCENT_6 /* 259 */:
                this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                break;
            case StyleIdentifier.SUBTLE_EMPHASIS /* 260 */:
                zzZU0 zzzu0ZzE2 = zzE2(iZzZiG);
                ((Shape) this.zzZBi).getImageData().zzY7(zzzu0ZzE2 != null ? zzzu0ZzE2.getImageBytes() : com.aspose.words.internal.zzEF.zzDL());
                break;
            case StyleIdentifier.INTENSE_EMPHASIS /* 261 */:
                String value = ((zzZSS) zzzt9).getValue();
                zzZSV zzzsv = (zzZSV) this.zzYJv.zzZij();
                if (((zzzsv != null ? zzzsv.zzZiG() : 0) & 8) == 0) {
                    i = EditingLanguage.GERMAN_LUXEMBOURG;
                } else if (zzMw(value)) {
                    i = 4104;
                } else {
                    zzY("Invalid link to file, moved to image description.", new Object[0]);
                    i = 897;
                }
                this.zzZBi.setShapeAttr(i, value);
                break;
            case StyleIdentifier.SUBTLE_REFERENCE /* 262 */:
            case StyleIdentifier.PLAIN_TABLE_1 /* 267 */:
                break;
            case StyleIdentifier.INTENSE_REFERENCE /* 263 */:
                this.zzZBi.setShapeAttr(zzzt9.getId(), zzY0E.zzhI(iZzZiG));
                break;
            case StyleIdentifier.BOOK_TITLE /* 264 */:
            case StyleIdentifier.BIBLIOGRAPHY /* 265 */:
            case StyleIdentifier.TOC_HEADING /* 266 */:
                this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                break;
            case StyleIdentifier.PLAIN_TABLE_2 /* 268 */:
            case StyleIdentifier.PLAIN_TABLE_3 /* 269 */:
            case 270:
                this.zzZBi.setShapeAttr(zzzt9.getId(), zzY0E.zzhI(iZzZiG));
                break;
            default:
                switch (id) {
                    case StyleIdentifier.GRID_TABLE_3_ACCENT_1 /* 282 */:
                    case StyleIdentifier.GRID_TABLE_4_ACCENT_1 /* 283 */:
                    case StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_1 /* 285 */:
                        this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                        break;
                    case StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_1 /* 284 */:
                    case StyleIdentifier.GRID_TABLE_7_COLORFUL_ACCENT_1 /* 286 */:
                    case StyleIdentifier.GRID_TABLE_1_LIGHT_ACCENT_2 /* 287 */:
                        break;
                    default:
                        zzE1(zzzt9.getId());
                        break;
                }
                break;
        }
    }

    private void zzV(zzZT9 zzzt9) {
        int iZzZiG = zzzt9.zzZiG();
        int id = zzzt9.getId();
        if (id != 255) {
            switch (id) {
                case 192:
                case 193:
                case 197:
                    zzZSS zzzss = (zzZSS) com.aspose.words.internal.zzZKW.zzZ(zzzt9, zzZSS.class);
                    if (zzzss != null) {
                        this.zzZBi.setShapeAttr(zzzt9.getId(), zzzss.getValue());
                    }
                    break;
                case 194:
                    this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                    break;
                case 195:
                case 196:
                    this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                    break;
                case 198:
                    zzE0(zzzt9.getId());
                    break;
                default:
                    zzE1(zzzt9.getId());
                    break;
            }
            return;
        }
        zzZ(this.zzZBi, 240, iZzZiG);
        zzZ(this.zzZBi, 241, iZzZiG);
        zzZ(this.zzZBi, 242, iZzZiG);
        zzZ(this.zzZBi, 243, iZzZiG);
        zzZ(this.zzZBi, 244, iZzZiG);
        zzZ(this.zzZBi, 245, iZzZiG);
        zzZ(this.zzZBi, 246, iZzZiG);
        zzZ(this.zzZBi, StyleIdentifier.LIGHT_LIST_ACCENT_6, iZzZiG);
        zzZ(this.zzZBi, StyleIdentifier.LIGHT_GRID_ACCENT_6, iZzZiG);
        zzZ(this.zzZBi, StyleIdentifier.MEDIUM_SHADING_1_ACCENT_6, iZzZiG);
        zzZ(this.zzZBi, 250, iZzZiG);
        zzZ(this.zzZBi, StyleIdentifier.MEDIUM_LIST_1_ACCENT_6, iZzZiG);
        zzZ(this.zzZBi, StyleIdentifier.MEDIUM_LIST_2_ACCENT_6, iZzZiG);
        zzZ(this.zzZBi, StyleIdentifier.MEDIUM_GRID_1_ACCENT_6, iZzZiG);
        zzZ(this.zzZBi, StyleIdentifier.MEDIUM_GRID_2_ACCENT_6, iZzZiG);
        zzZ(this.zzZBi, 255, iZzZiG);
    }

    private void zzW(zzZT9 zzzt9) {
        int iZzZiG = zzzt9.zzZiG();
        int id = zzzt9.getId();
        if (id == 191) {
            zzZ(this.zzZBi, 187, iZzZiG);
            zzZ(this.zzZBi, 188, iZzZiG);
            zzZ(this.zzZBi, 189, iZzZiG);
            zzZ(this.zzZBi, 190, iZzZiG);
            zzZ(this.zzZBi, 191, iZzZiG);
            return;
        }
        switch (id) {
            case 128:
                this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                break;
            case 129:
            case 130:
            case 131:
            case 132:
                this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                break;
            case 133:
                this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                break;
            case 134:
                this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                break;
            case 135:
                this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                break;
            case 136:
                this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                break;
            case 137:
                this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                break;
            case 138:
                this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                break;
            case 139:
            case 140:
            case 141:
                this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                break;
            case 142:
                zzE0(zzzt9.getId());
                break;
            default:
                zzE1(zzzt9.getId());
                break;
        }
    }

    private void zzX(zzZT9 zzzt9) {
        int iZzZiG = zzzt9.zzZiG();
        if (zzzt9.getId() != 127) {
            zzE1(zzzt9.getId());
            return;
        }
        zzZ(this.zzZBi, 119, iZzZiG);
        zzZ(this.zzZBi, 120, iZzZiG);
        zzZ(this.zzZBi, 121, iZzZiG);
        zzZ(this.zzZBi, 122, iZzZiG);
        zzZ(this.zzZBi, 123, iZzZiG);
        zzZ(this.zzZBi, 124, iZzZiG);
        zzZ(this.zzZBi, 125, iZzZiG);
        zzZ(this.zzZBi, 126, iZzZiG);
        zzZ(this.zzZBi, 127, iZzZiG);
    }

    private void zzY(zzZT9 zzzt9) {
        int iZzZiG = zzzt9.zzZiG();
        if (zzzt9.getId() != 4) {
            zzE1(zzzt9.getId());
        } else {
            this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
        }
    }

    private static void zzf(ShapeBase shapeBase) {
        if (shapeBase.zzYvW().contains(StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_3)) {
            return;
        }
        shapeBase.setShapeAttr(StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_3, new zzYM4[]{zzYM4.zzXFf.zzYnE()});
    }

    public final void zzZ(zzZT8 zzzt8, ShapeBase shapeBase, zzZT4 zzzt4) throws Exception {
        this.zzZBi = shapeBase;
        this.zzYJw = zzzt4;
        this.zzYJv = zzzt8;
        for (int i = 0; i < zzzt8.getCount(); i++) {
            zzZT9 zzzt9ZzE6 = zzzt8.zzE6(i);
            int id = zzzt9ZzE6.getId() & (-64);
            switch (id) {
                case 0:
                    zzY(zzzt9ZzE6);
                    break;
                case 64:
                    zzX(zzzt9ZzE6);
                    break;
                case 128:
                    zzW(zzzt9ZzE6);
                    break;
                case 192:
                    zzV(zzzt9ZzE6);
                    break;
                case 256:
                    zzU(zzzt9ZzE6);
                    break;
                case StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_6 /* 320 */:
                    zzT(zzzt9ZzE6);
                    break;
                case 384:
                    zzS(zzzt9ZzE6);
                    break;
                case 448:
                    zzZ(zzzt9ZzE6, id);
                    break;
                case 512:
                    zzR(zzzt9ZzE6);
                    break;
                case 576:
                    zzQ(zzzt9ZzE6);
                    break;
                case 640:
                    zzP(zzzt9ZzE6);
                    break;
                case 704:
                    zzO(zzzt9ZzE6);
                    break;
                case ViewUtils.EDGE_TO_EDGE_FLAGS /* 768 */:
                    zzN(zzzt9ZzE6);
                    break;
                case 832:
                    zzM(zzzt9ZzE6);
                    break;
                case 896:
                    zzL(zzzt9ZzE6);
                    break;
                case 1024:
                    zzK(zzzt9ZzE6);
                    break;
                case 1280:
                    zzJ(zzzt9ZzE6);
                    break;
                case 1344:
                case 1408:
                case 1472:
                case TableStyleOptions.DEFAULT_2003 /* 1536 */:
                case 1600:
                    zzZ(zzzt9ZzE6, id);
                    break;
                case 1664:
                    this.zzYJC.zzTG(com.aspose.words.internal.zzZKN.format("Unsupported OfficeArt property 0x{0:x4}, ignored.", Integer.valueOf(zzzt9ZzE6.getId())));
                    break;
                case 1728:
                    zzI(zzzt9ZzE6);
                    break;
                case 1792:
                    zzH(zzzt9ZzE6);
                    break;
                case 1856:
                case 2048:
                case 2112:
                case 2176:
                case 8192:
                case 8384:
                    this.zzYJC.zzTG(com.aspose.words.internal.zzZKN.format("Unknown OfficeArt property found 0x{0:x4}, ignored.", Integer.valueOf(zzzt9ZzE6.getId())));
                    break;
                case 1920:
                    zzG(zzzt9ZzE6);
                    break;
                case 1984:
                    zzF(zzzt9ZzE6);
                    break;
                case 4096:
                    break;
                default:
                    zzE1(zzzt9ZzE6.getId());
                    break;
            }
        }
        if (this.zzZBi.isSignatureLine() && !this.zzZBi.zzYvW().contains(FieldType.FIELD_CITATION)) {
            this.zzZBi.setShapeAttr(FieldType.FIELD_CITATION, Boolean.TRUE);
        }
        zzZTF.zzX(this.zzZBi.zzYvW());
        if (this.zzZBi.getShapeType() == 100 && this.zzYJw.zzZia()) {
            zzf(this.zzZBi);
        }
    }

    private void zzY(String str, Object... objArr) {
        this.zzYJC.zzTG(com.aspose.words.internal.zzZKN.format(str, objArr));
    }

    private void zzZ(zzZT9 zzzt9, int i) throws Exception {
        if (i != 448) {
            return;
        }
        int iZzZiG = zzzt9.zzZiG();
        int id = zzzt9.getId();
        if (id == 504 || id == 505) {
            this.zzYJC.zzTG(com.aspose.words.internal.zzZKN.format("Unknown OfficeArt property found 0x{0:x4}, ignored.", Integer.valueOf(zzzt9.getId())));
            return;
        }
        if (id != 511) {
            switch (id) {
                case 448:
                case 450:
                    this.zzZBi.setShapeAttr(zzzt9.getId(), zzY0E.zzhI(iZzZiG));
                    break;
                case 449:
                case 451:
                    this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                    break;
                case 452:
                    this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                    break;
                case 453:
                    zzZU0 zzzu0ZzE2 = zzE2(iZzZiG);
                    if (zzzu0ZzE2 != null) {
                        this.zzZBi.setShapeAttr(4111, zzzu0ZzE2.getImageBytes());
                        this.zzZBi.setShapeAttr(4121, Integer.valueOf(zzzu0ZzE2.getPresetTexture()));
                    }
                    break;
                case 454:
                    this.zzZBi.setShapeAttr(zzzt9.getId(), ((zzZSS) zzzt9).getValue());
                    break;
                case 455:
                case 456:
                case 457:
                    this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                    break;
                case 458:
                    this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                    break;
                case 459:
                    this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                    break;
                case 460:
                    this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                    break;
                case 461:
                    this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                    break;
                case 462:
                    this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                    break;
                case 463:
                    this.zzYJC.zzTG(com.aspose.words.internal.zzZKN.format("Unsupported OfficeArt property 0x{0:x4}, ignored.", Integer.valueOf(zzzt9.getId())));
                    break;
                case 464:
                    this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                    break;
                case 465:
                    this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                    break;
                case 466:
                    this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                    break;
                case 467:
                    this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                    break;
                case 468:
                    this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                    break;
                case 469:
                    this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                    break;
                case 470:
                    this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                    break;
                case 471:
                    this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                    break;
                default:
                    switch (id) {
                        case 473:
                        case 477:
                            if (iZzZiG != -1) {
                                this.zzZBi.setShapeAttr(zzzt9.getId(), zzY0E.zzhI(iZzZiG));
                            }
                            break;
                        case 474:
                        case 476:
                        case 478:
                        case 481:
                        case 482:
                            this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(iZzZiG));
                            break;
                        case 475:
                        case 479:
                            this.zzZBi.setShapeAttr(zzzt9.getId(), Integer.valueOf(zzY0E.zzhH(iZzZiG)));
                            break;
                        case 480:
                            this.zzYJC.zzTG(com.aspose.words.internal.zzZKN.format("Unknown OfficeArt property found 0x{0:x4}, ignored.", Integer.valueOf(zzzt9.getId())));
                            break;
                        default:
                            zzE1(zzzt9.getId());
                            break;
                    }
                    break;
            }
            return;
        }
        zzZ(this.zzZBi, 505, iZzZiG);
        zzZ(this.zzZBi, 506, iZzZiG);
        zzZ(this.zzZBi, 507, iZzZiG);
        zzZ(this.zzZBi, 508, iZzZiG);
        zzZ(this.zzZBi, 509, iZzZiG);
        zzZ(this.zzZBi, 510, iZzZiG);
        zzZ(this.zzZBi, FrameMetricsAggregator.EVERY_DURATION, iZzZiG);
        zzZ(this.zzZBi, 503, iZzZiG);
        zzZ(this.zzZBi, 504, iZzZiG);
    }

    private static void zzZ(ShapeBase shapeBase, int i, int i2) {
        int iZzE9 = zzZTH.zzE9(i);
        if (((iZzE9 << 16) & i2) != 0) {
            shapeBase.setShapeAttr(i, Boolean.valueOf((i2 & iZzE9) != 0));
        }
    }
}
