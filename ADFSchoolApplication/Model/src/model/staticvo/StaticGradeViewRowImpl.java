package model.staticvo;

import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Sep 14 23:21:51 BST 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class StaticGradeViewRowImpl
  extends ViewRowImpl
{
  /**
   * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
   */
  protected enum AttributesEnum
  {
    GradeId,
    GradeDesc;
    private static AttributesEnum[] vals = null;
    private static final int firstIndex = 0;

    protected int index()
    {
      return AttributesEnum.firstIndex() + ordinal();
    }

    protected static final int firstIndex()
    {
      return firstIndex;
    }

    protected static int count()
    {
      return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
    }

    protected static final AttributesEnum[] staticValues()
    {
      if (vals == null)
      {
        vals = AttributesEnum.values();
      }
      return vals;
    }
  }
  public static final int GRADEID = AttributesEnum.GradeId.index();
  public static final int GRADEDESC = AttributesEnum.GradeDesc.index();

  /**
   * This is the default constructor (do not remove).
   */
  public StaticGradeViewRowImpl()
  {
  }
}

