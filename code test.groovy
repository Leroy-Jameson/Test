import eu.mihosoft.vrl.v3d.CSG
import eu.mihosoft.vrl.v3d.Cube

// code here
CSG Base = new Cube(	40,// X dimention
			60,// Y dimention
			80//  Z dimention
			).toCSG()// this converts from the geometry to an object we can work with

return Base