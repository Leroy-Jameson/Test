import eu.mihosoft.vrl.v3d.CSG
import eu.mihosoft.vrl.v3d.Cube
import eu.mihosoft.vrl.v3d.Isosceles

// code here
CSG Base = new Cube(	20,// X dimention
			20,// Y dimention
			20//  Z dimention
			).toCSG()// this converts from the geometry to an object we can work with
Base = Base.toZMin() 
		.toXMin() .toYMin()
CSG Roof = new Isosceles(20,20,15).toCSG()
		.toXMin() .toYMin() .movez(20)

return CSG.unionAll([Base, Roof])