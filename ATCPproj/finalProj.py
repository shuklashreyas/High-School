GlowScript 3.1 VPython

scene =canvas(width=600, height=400, background=color.white, center=vec(4,3,0))
ball=  sphere(pos=vec(0,0.85,5.63), radius=0.1, color=color.red)
floor= box(pos=vec(0,0,0), size=vec(4,0.05,11.8),color=color.green)
wall = box(pos = vec(0,1.9,-5.4), size = vec(4,3.84,0.5), color = color.orange)

scene.caption = "Vary the Velocity speed: \n\n"

def setspeed(s):
    wt.text = '{:1.2f}'.format(s.value)
    
sl = slider(min=15, max=20, length=220, bind=setspeed, right=10)

wt = wtext(text='{:1.2f}'.format(sl.value))

scene.append_to_caption(' m/s\n')
    
    
def setspeedz(a):
    sd.text = '{:1.2f}'.format(a.value)    
    
animationSpeed = slider(min=300, max=1000, length=220, bind=setspeedz, right=10)

sd = wtext(text='{:1.2f}'.format(animationSpeed.value))

scene.append_to_caption(' animation speed\n')

gd1= graph(xtitle= "Time s",ytitle= "Y(x) m", width = 300, height = 200)
f1 = gdots(color = color.blue, graph = gd1)
gd2= graph(xtitle= "Time s",ytitle= "Y(x) m", width = 300, height = 200)
f2 = gdots(color = color.blue, graph = gd2)
gd3= graph(xtitle= "Time s",ytitle= "Y(x) m", width = 300, height = 200)
f3 = gdots(color = color.blue, graph = gd3)

"""
gd4= graph(xtitle= "Time s",ytitle= "X(x) m", width = 300, height = 200)
f4 = gdots(color = color.blue, graph = gd4)
gd5= graph(xtitle= "Time s",ytitle= "X(x) m", width = 300, height = 200)
f5 = gdots(color = color.blue, graph = gd5)
gd6= graph(xtitle= "Time s",ytitle= "X(x) m", width = 300, height = 200)
f6 = gdots(color = color.blue, graph = gd6)
"""

ball.velocity=vector(0,-0.937,0)
ball.mass=0.4
ball.p=ball.velocity*ball.mass
g=vector(0,-9.8,0)
Fnet=g*ball.mass
dt = 0.001
t = 0
c=.5
rho = 1.2
A = pi*ball.radius**2

while t<1.95:
    rate(animationSpeed.value)
    Fnet = g*ball.mass - 0.5*rho*c*A*mag(ball.p/ball.mass)**2*ball.p/mag(ball.p)
    ball.pos=ball.pos + (ball.p/ball.mass)*dt
    ball.p = ball.p +Fnet*dt
    t = t + dt
    if ball.pos.y < (floor.pos.y + ball.radius):
        ball.p = -ball.p
    f1.plot(t, ball.pos.y)
 
    
rhosoccer=74*1.02
v0=sl.value#15
theta = 25*pi/180
ball.v=v0*vector(0,sin(theta),-cos(theta))
rhoSoc=1.02 #density of air
CSoc=.47 #the drag coefficient for a sphere
ASoc = pi*ball.radius**2
tSoc=0
dtSoc=0.001
ball.pSoc= ball.mass*ball.v
ball.omega=vector(0,20,0)

s=.0033
#ball bouncing going towards wall pMotion

h = 11.6 / v0 # how long should the ball travel for time = distance/speed
t = 0
while t<h:
    rate(animationSpeed.value)
    ball.v=ball.pSoc/ball.mass
    #F=(ball.mass*g-.5*rhoSoc*ASoc*CSoc*norm(ball.v)*mag(ball.v)**2)
    F= ball.mass*g - .5*rhoSoc*ASoc*CSoc*norm(ball.v)*mag(ball.v)**2 + s*cross(ball.omega,ball.v)
    ball.pSoc=ball.pSoc+F*dt
    ball.pos=ball.pos+ball.pSoc*dt/ball.mass
    t=t+dt
    f2.plot(t, ball.pos.y)


v2=-15
theta = 20*pi/180
ball.v2 =v2*vector(0,-sin(theta),-cos(theta))
ball.pSoc2= ball.mass*ball.v2
t = 0
while t < h:
    rate(animationSpeed.value)
    ball.v2=ball.pSoc2/ball.mass
    #F=(ball.mass*g-.5*rhoSoc*ASoc*CSoc*norm(ball.v2)*mag(ball.v2)**2)
    F= ball.mass*g - .5*rhoSoc*ASoc*CSoc*norm(ball.v2)*mag(ball.v2)**2 + s*cross(ball.omega,ball.v)
    ball.pSoc2= ball.pSoc2+F*dt
    ball.pos= ball.pos+ball.pSoc2*dt/ball.mass
    t=t+dt
    f3.plot(t, ball.pos.y)
